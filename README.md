# api-pessoa
<h3>:information_source: Avaliação de conhecimentos backend</h3><br>
<h4>Projeto desenvolvido em Java, SpringBoot e Lombok.<br>
 
# :hammer: Funcionalidades do projeto

<h5><ul> 
 <li>Criar uma pessoa - POST - <i>("/pessoas/criar-pessoas/")</i></li>
<li>Editar uma pessoa - PUT - <i>("/pessoas/{id}/editar-pessoa")</i></li>
<li>Consultar uma pessoa - GET - <i>("/pessoas/{id}/buscar-pessoa")</i></li>
<li>Listar Pessoas - GET - <i>("/pessoas/listar-pessoas")</i></li>
<li>Criar Endereço para pessoa - POST - <i>("/enderecos/cadastrar-endereco")</i></li> 
<li>Listar endereços da Pessoa - GET - <i>("/enderecos/{id}/buscar-enderecos")</i></li>
<li>Poder informar qual endereço é o principal da pessoa - <i>Atributo "enderecoPrincipal" do model Endereço (boolean)</i></li>
 </ul></h5><br>
 
 # :page_with_curl: Postman Collections para testar as funcionalidades:

 <h5>Basta clicar em <b>import > raw text</b> e colar o texto contido no link abaixo:</h5><br>

https://api.postman.com/collections/19627585-5407de76-9466-495f-8308-8d1660bc3f94?access_key=PMAT-01GQ1DHH56HGMRQD0FJKKRHZ82

# :small_red_triangle: Questões anexadas ao teste:

:question: Durante a implementação de uma nova funcionalidade de software solicitada, quais critérios você avalia e implementa para garantia de qualidade de software?<br>
 :pencil2: Para garantir a qualidade, o ideal é que façamos a utilização dos princípios:<br>
 -S.O.L.I.D.:<br>
Princípio da Responsabilidade Única — Uma classe deve ter um, e somente um, motivo para mudar.<br>
Princípio Aberto-Fechado — Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação, ou seja, quando novos comportamentos e recursos precisam ser adicionados no software, devemos estender e não alterar o código fonte original.<br>
Princípio da substituição de Liskov — Uma classe derivada deve ser substituível por sua classe base.<br>
Princípio da Segregação da Interface — Uma classe não deve ser forçada a implementar interfaces e métodos que não irão utilizar.<br>
Princípio da Inversão de Dependência — Dependa de abstrações e não de implementações.<br><br>

 -Clean Code:<br> 
Nomear variáveis que descrevam a idéia contida de forma simples e intuitiva.<br>
Deixar o código mais limpo do que estava antes de mexer nele.<br>
Criar funções simples, claras e pequenas.<br>
Cada pedaço do conhecimento de um sistema deve ter uma representação única e ser totalmente livre de ambiguidades.<br>
Comentar apenas o necessário.<br>
Garantir que o código continuará fazendo o que precisa.<br>
O código só é considerado limpo após ser validado através de testes.<br><br>

:question:	Em qual etapa da implementação você considera a qualidade de software?<br>
:pencil2: Todo o processo.<br>
