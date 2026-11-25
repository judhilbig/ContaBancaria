ATIVIDADE: CONTA BANCARIA

Como abrir:
1. Extraia o arquivo ZIP.
2. Abra o IntelliJ IDEA e selecione Open.
3. Escolha a pasta ContaBancaria.
4. Abra src/Main.java.
5. Execute o metodo main (seta verde ao lado do main).

ORDEM SUGERIDA PARA TESTAR:
1. Cadastre um gerente (opcao 1).
2. Cadastre um segundo gerente (opcional).
3. Cadastre clientes e associe cada um a um gerente (opcao 2).
4. Liste todos os clientes (opcao 3).
5. Escolha "Listar clientes por gerente" (opcao 4) e informe o nome do gerente.
6. Teste deposito (opcao 5), saque (opcao 6) e consulta (opcao 7).
7. Encerre com a opcao 0.

RELACIONAMENTOS:
- Cada Cliente possui uma ContaBancaria.
- Cada Gerente possui uma lista de Clientes (ArrayList).
- No cadastro, o cliente e associado ao gerente escolhido.
- A conta recebe um numero automatico a partir de 1001.

OBSERVACAO:
O sistema armazena os dados em memoria durante a execucao. Ao fechar o programa, os cadastros sao reiniciados.
