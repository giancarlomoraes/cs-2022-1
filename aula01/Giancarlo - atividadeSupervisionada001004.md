### Semana 1 - Dia 25/05/2022 - Aulas 001a004 - Atividade Supervisionada


1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).
 
#### API REST

Os conceitos de API REST (sigla para Representational State Transfer) surgiu nos anos 2000, um dos principais deles é usar o protocolo HTTP para a comunicação de dados. É importante lembrar que isso não é uma linguagem de programação e sim um modelo de restrições, padrões e protocolos que dá oferece a possibilidade de que sistemas possam se comunicar diretamente.

Essa arquitetura pode utilizar vários tipos de recursos para ser a "linguagem" entre as requisições, como por exemplo: JSON, XML, Imagens, etc...

##### Restrições

1. Client-Server
É a restrição base da arquitetura REST que separa o cliente (geralmente quem "chama") do servidor (quem "responde"), o objetivo dessa restrição é estabelecer uma divisão que consiga separar o que cada um fará. Por exemplo: o servidor que terá o trabalho de ir no banco de dados e buscar alguma informação enquanto o cliente está preocupado em como essa informação irá ser disponibilizada.

2. Stateless
É comum um cliente chamar o mesmo servidor várias e várias vezes, porém, cada uma dessas chamadas (requests) devem ser independentes e conter apenas as informações necessárias para que o servidor opere normalmente. Ou seja, neste caso, o servidor nunca deve guardar nenhuma informação a respeito do estado do cliente. As informações de sessão por exemplo, nunca devem estar salvas no servidor e sim no cliente.

3. Cacheable
Como um servidor pode ser chamado por múltiplos clientes, é provável que algumas dessas chamadas tenha o mesmo objetivo ou até mesmo sejam idênticas. Por isso é uma boa prática guardar essas respostas em cache para que assim que o primeiro cliente faça uma requisição, o servidor retorne a informação, porém, também guarde ela em cache para que sempre que alguma chamada seja feita da mesma maneira pedindo os mesmos dados, o servidor devolve o valor que está em cache sem precisar processar tudo de novo. O desenvolvedor pode optar por um tempo limite ou outras regras para limpar o cache e preencher a informação novamente.

4. Uniform Interface
É meio que um acordo entre cliente e servidor para montar a requisição, dentro dessa "interface" podemos identificar o resource (uri), o tipo de dado que será passado (JSON, XML, FormData) e o servidor sempre deve dar uma resposta auto-explicativa, ou seja informar se tudo foi ok (Código 200), se houve um erro no servidor (Código 500), e por aí vai.

5. Layered System
Quando se trata tanto de segurança quanto de performance, é muito bom que esse 5º princípio seja utilizado. Layered system diz respeito ao nível de proximidade do cliente com o servidor, o cliente nunca deve conseguir chamar diretament o servidor e sim um intermediador (load balancer ou reverse proxy por exemplo), isso garante que o cliente só se preocupe com a comunicação com o intermediador e este por vez faz a comunicação com o(s) servidor(es).

6. Code-On-Demand
Não muito utilizada por não ser obrigatória, mas que resolve alguns problemas, o 6º princípio é utilizado para permitir que o cliente de certa forma possa aproveitar parte da lógica executada pelo servidor utilizando scripts por exemplo, a dinamicidade que isso oferece é muito boa, já que diferentes clientes podem usar o mesmo serviço e esse serviço retornar informações relevantes para cada tipo de cliente

##### RESTful
Muitas pessoas acham que usar os verbos HTTP e alguns formatos de dados/diferentes tipos de respostas torna uma API RESTful, mas isso não é verdade. Para uma API ser considerada RESTful ela deve seguir os princípios destacados acima (com exceção do 6º), além de possuir uma "classificação" que é algo mais específico, mas podemos falar por cima

* Nível 0: É quando não se obedece nenhuma regra, e geralmente é usado apenas uma URI e um verbo HTTP (GET/POST/PUT/DELETE são os mais usados).
* Nível 1: Aplicação de resources. Quando a API é dividida em vários endpoints que apontam para um ou mais resources.
* Nível 2: Utilização dos verbos adequadamente. Por exemplo um GET/ para `/escola` retornar todas as escolas e um POST/ para `/escola` passando dados e o servidor criando a escola na base de dados.
* Nível 3: HATEOAS (Hypertext As The Engine Of Application State). Quando a API fornece ao cliente todas as informações necessárias para interagir com a aplicação. Últimamente se tornando mais comuns alguns frameworks como o Swagger que gera uma documentação automática de toda sua aplicação. Ou quando se utiliza ferramentas para identificar o que está errado em uma requisição e informar ao usuário.

