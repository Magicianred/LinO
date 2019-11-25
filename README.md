# LinO

Quando o seu time realiza compras em grupo, sempre ficam aquelas dúvidas com relação a quem já pagou ou ainda não. Este projeto possui o objetivo principal de auxiliar no gerenciamento de contas de equipes. Você já pagou o churrasco na sua vez e o seu colega ainda não? Não precisa mais ficar cobrando ele, a gente cobra pra você ;)

## Inicialização
Para executar o projeto, utilize as ferramentas descritas na sessão *Ferramentas*.

## Ferramentas
* [IntelliJ](https://www.jetbrains.com/idea/) - IDE para desenvolvimento.

## Links importantes
* [Spring Boot Rest API](https://medium.com/better-programming/building-a-spring-boot-rest-api-a-php-developers-view-part-i-6add2e794646) -  API com Spring Boot.

# Controle de finanças

## Introdução

Este projeto possui o objetivo principal de verificar e auxiliar no gerenciamento do contas relativas a gastos em grupo, sendo possível inserir novos gastos, montar equipes, enviar alertas personalizados e verificar seu saldo com relação a cada colega. 

O objetivo não é fazer conexão com aplicativos bancários, o objetivo é ter um aplicativo totalmente desassociado a outras plataformas, que informa através do cadastramento, como é possível realizar o pagamento de dívidas associadas a gastos em grupo.

## Análise técnica

### Descrição do ambiente técnico

O sistema é composto por um banco de dados relacional e uma interface web, com o propósito de oferecer para grupos de qualquer tipo o controle de gastos financeiros, a inserção de comprovantes fiscais, divisão dos gastos, alertas com informações financeiras, facilitando o pagamento e controle.

As ferramentas utilizadas para o desenvolvimento incluem *Java 8* que é uma linguagem de programação utilizada para o Back-end, para programação de alto nível foi utilizado *JavaScript*, *Hibernate* e *SpringBoot*, além disso utilizou-se o *IntelliJ* que atua como ambiente de desenvolvimento integrado (IDE), *Mysql Workbench* atuando como sistema gerenciador de banco de dados relacional e *Docker* para utilizar o ambiente em container.

### Levantamento de requisitos  
Os requisitos foram criados sem base de pesquisa, apenas para experimentação.

### Requisitos Funcionais
Respeitando a proposta, o sistema deverá atender os seguintes requisitos:

* **RF1** - Acesso simplificado ao sistema (Gmail, Facebook, instagram).
* **RF2** - Cadastro de diversos grupos.
* **RF3** - Identificar o saldo do usuário de forma fácil.
* **RF4** - Gerar alertas para pagamento.
* **RF5** - Cadastro de informações para pagamento.
* **RF6** - Inserção de categorias para compras.
* **RF7** - Informar o historico de pagamentos.
* **RF8** - Devedor informar que já pagou.
* **RF9** - Recebedor informar que já recebeu.

## Regras de Negócio

1. **RGN1** - *Alertas de pagamento*

Um aviso deverá ser enviado para todos os devedores assim que o gasto for lançado. O aviso deverá ser reenviado diariamente  após expirar o prazo de pagamento, enquanto o recebedor não informar que a dívida já foi quitada.

2. **RGN2** - *Login no sistema*

O administrador irá acessar o sistema de forma bem simples no primeiro momento, após deverá acessar com oAuth diretamente através de gmail, facebook ou instagram. Assim que logar no sistema, deverá cadastrar também seus dados financeiros para que sejam enviados junto com o alerta para o devedor.

4. **RGN3** - *Inserção dos gastos *

Ao inserir novos gastos, é possível inserir comprovantes de compra, associar integrantes do gasto e definir como os custos devem ser divididos.

## Casos de Uso

1. **UC1** - *Primeiro login no sistema*

Ao entrar no sistema pela primeira vez o usuário deve cadastrar suas informações.
Nome, e-mail, login, senha e dados financeiros.

2. **UC2** - *Cadastro de gasto*

Para inserir um novo gasto, é necessário definir o grupo que deverá pagar.
Categoria da compra, porcentagens de pagamento, o período máximo para ser realizado e a forma de pagamento.

### Mensagens internas

Rotas utilizadas pela aplicação web para executar metodos de **POST** e **GET** no banco de dados. Onde o retorno de cada uma das funções estara contido em uma sessão para renderização de páginas web.

| Nome | Funcionalidade|
|------|--------------|
|```GET``` /listarUsuario|Informa todos usuários registrados no banco.|
|```GET``` /listarGrupo|Informa todos os grupos registrados no banco.|
|```GET``` /verificaSaldo|Informa o saldo atual de um usuário.|
|```GET``` /Inativos|Informa todos os funcionários demitidos.|
|```POST``` /insereUsuario|Insere um novo usuário.|
|```POST``` /atualizaUsuario|Atualiza o usuário.|
|```POST``` /insereGrupo|Insere um novo grupo.|
|```POST``` /insereUsuarioGrupo|Associa um usuário a um grupo|
|```POST``` /removeUsuarioGrupo|Desassocia um usuário de um grupo|
|```POST``` /insereGasto|Insere um novo gasto de grupo.|
|```POST``` /atualizaGasto|Atualiza informações sobre os gastos de um grupo.|
