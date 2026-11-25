"""Tabela de símbolos da linguagem Angels."""
from dataclasses import dataclass


@dataclass
class Simbolo:
    nome: str
    tipo: str        # int ou float
    categoria: str   # "variavel" | "parametro" | "funcao"
    linha: int
    escopo: str      # global ou local
    params: list | None = None   # só para função: tipos dos parâmetros, em ordem


class TabelaDeSimbolos:
    def __init__(self):
        self._escopos = [{}]      # [0] = escopo global
        self._historico = []      # tudo que já foi declarado (usado no relatório)

    def entrar_escopo(self):
        self._escopos.append({})

    def sair_escopo(self):
        if len(self._escopos) > 1:
            self._escopos.pop()

    def _nome_escopo(self):
        n = len(self._escopos) - 1
        return "global" if n == 0 else f"local (nível {n})"

    def declarar(self, nome, tipo, categoria, linha, params=None):
        """Insere no escopo atual. Devolve None se o nome já existe nele
        (declaração duplicada); senão devolve o símbolo criado."""
        atual = self._escopos[-1]
        if nome in atual:
            return None
        simbolo = Simbolo(nome, tipo, categoria, linha, self._nome_escopo(), params)
        atual[nome] = simbolo
        self._historico.append(simbolo)
        return simbolo

    def buscar_no_escopo_atual(self, nome):
        return self._escopos[-1].get(nome)

    def buscar(self, nome):
        """Procura do escopo mais interno até o global."""
        for escopo in reversed(self._escopos):
            if nome in escopo:
                return escopo[nome]
        return None

    def dump(self):
        if not self._historico:
            return "Tabela de símbolos vazia.\n"
        linhas = [f"{'NOME':<14}{'TIPO':<8}{'CATEGORIA':<12}{'ESCOPO':<18}LINHA",
                  "-" * 60]
        for s in self._historico:
            linhas.append(f"{s.nome:<14}{s.tipo:<8}{s.categoria:<12}{s.escopo:<18}{s.linha}")
        return "\n".join(linhas) + "\n"