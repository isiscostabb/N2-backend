# N2-backend
 Projeto de backend para avaliação N2

<br>
<br>

<h2>INSTRUÇÕES PARA EXECUÇÃO</h2>

- Dentro do arquivo principal (<kbd>N2backendApplication.java</kbd>) rode o projeto


- No insomnia crie uma nova HTTP Request, escolha o método POST e digite a URL: http://localhost:8080/http
- Na parte do BODY, escolha a opcão JSON e escreva: {"status_code": }, e após os dois pontos escreva o número correspondente ao status http que deseja verificar

<br>
<br>

<h2>DESCRIÇÃO DAS ROTAS</h2>

http://localhost:8080/cat
rota GET para consultas (apenas leitura) 

![Captura de Tela (74)](https://github.com/user-attachments/assets/a34d1d39-40bd-4ecb-996f-bd430c9dad32)

<br>

http://localhost:8080/sobre

![Captura de Tela (75)](https://github.com/user-attachments/assets/31a7e374-1520-4f5f-8a65-001b3aec012f)

<br>

http://localhost:8080/http 
rota POST que recebe dados pelo corpo da mensagem

<h3>EXEMPLO REQUISIÇÃO E RESPOSTA</h3>

![Captura de Tela (64)](https://github.com/user-attachments/assets/b38c69db-23d2-413b-b9c7-0e0501f31c14)
