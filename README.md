# Angels_compilador


# para regenerar o parser
java -jar ~/apps/antlr/antlr-4.13.2-complete.jar -Dlanguage=Python3 -visitor -no-listener Angels.g4

# para gerar tokens
python lexer_aluno.py exemplo_ok.txt

# para executar análise sintática e semântica
python main.py tokens.tsv