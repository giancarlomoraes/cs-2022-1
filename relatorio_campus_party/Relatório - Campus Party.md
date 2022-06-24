
# Atividade - Campus Party

A Campus Party é um evento muito interessante que tive a oportunidade de ir em 2019. Esse ano não pude ir presencialmente então tive que acompanhar as palestras de forma remota. Algumas palestras de bancada, eram bem barulhentas, mas ainda sim dava para acompanhar o tema, diferente de 2019. Comentando com alguns colegas percebi que algumas características se mantiveram, como o barulho atrapalhando diversas palestras e os temas muito superficiais.

## Aumente a segurança de suas aplicações com _software livre_

A palestra foi realizada pelo Samuel Gonçalves que é consultor de tecnologia nas áreas de Segurança Ofensiva e DevSecOps e transmitida na Campus Online no palco Git.

De início o palestrante apresentou os princípios da segurança, o famoso CID, Confiabilidade, Integridade e Disponibilidade, e logo após apresentou o Secure Shift Left, que é uma abordagem que traz a segurança desde o início do desenvolvimento de um software, passando por fases

* Requisitos: Levantar os requisitos pensando em segurança, usar tecnologias atualizadas e bibliotecas modernas e seguras.
* Design: Recomenda usar a Modelagem de Ameaças que consiste em levantar pontos como: "Haverá interação com alguma aplicação externa?", "Esta aplicação externa, possui alguma vulnerabilidade?", "Qual a versão de banco de dados será utilizada?", "Qual o tipo de autenticação utilizada pela API". Além disso consiste em pesquisar os principais erros de vulnerabilidade daquela linguagem que será escolhida.
* Desenvolvimento: O foco nessa etapa é evitar vulnerabilidades utilizando materias que frequentemente reportam as falhas de segurança que existem. Além disso é nessa etapa que temos que validar de fato como o código está se comportando, para isso podemos utilizar ferramentas que analisam o código de fato (dentro da IDE) como por exemplo o SonarLint (software livre).
* Testes: Review de código, qualidade de código, validar a segurança do software. Encontrar vulnerabilidades no código fonte, realizar por exemplo o SAST (Static application security testing), como o SonarQube.
* Deploy: Etapa onde geralmente ocorre o pentest ou o DAST (Dynamic application security testing), com o objetivo de estressar a aplicação para tentar revelar falhas que não foram encontradas nas etapas anteriores.

Além disso, o palestrante também fala um pouco sobre como funciona a integração contínua, a entrega contínua e os testes. Finaliza a palestra dizendo que esse processo inteiro é uma pequena etapa do que um DevSecOps realiza.

## Como explodir uma usina de enriquecimento de urânio? Do ataque real a reprodução em casa

A palestra foi realizada pelo João Moreno, colega do Gabriel (meu amigo desde o ensino médio) e transmitida na Campus Online no palco Git.

No começo ele deu uma introdução ao stuxnet, que foi um ataque desenvolvido pelo governo dos Estados Unidos e de Israel. A missão era infectar as centrífugas que eram responsabilizadas por filtrar o urânio 235 (que é mais instável, portanto, mais radioativo) do urânio 238, para retardar o processo de enriquecimento.
Ele explica desde como o malware foi instalado nas máquinas até o ataque em si, passando por várias etapas.

Logo após o palestrante mostra como ele fez um ataque parecido na BHACK, um evento de hacking, atacando um equipamento que simulava bombas que subiam um nível de água em um tanque. Dividiu a tela em 3, do lado esquedo a perspectiva de quem via a interface de funcionamento das bombas em que tudo ocorria bem, no meio os scripts que ele realizou para se comunicar com a máquina, e por último, do lado direito, a máquina de fato comprometida com todos os leds piscando indicando a instabilidade da mesma.
