# Tarefa 011 - Padrões de Codificação (Leiaute e estilo), Reflexão e Programação defensiva - 08/07/2022

## Padrões de codificação

Os padrões de codificação são utilizados para nos ajudar na hora da compreensão do código, no Java (linguagem que domino) existem vários padrões e convenções (inclusives adotadas pela comunidade) que todos utilizam. Alguns exemplos de convenção de nomes são: classes, interface, variáveis, métodos, constantes, enums. Além disso, existem padrões para organizar um código para que tudo fique mais claro de se entender, como por exemplo: manter identação, utilizar linhas em branco para organizar blocos de código, usar comentário para explicar um trecho de código complexo, sempre utilizar chaves em estruturas de condição/repetição, etc...

## Reflexão

Reflexão (no Java: Reflection API) é uma API que possibilita aos aplicativos o acesso e a modificação do comportamento de aplicações que estão rodando na JVM (Java Virtual Machine). Por exemplo: Uma classe pode acessar informações de outras classes, com isso, informações como construtores, atributos e métodos poder ser acessados.

O Conceito de Reflection é importante, pois permite escrever programas que não precisam "saber" tudo em tempo de compilação, tornando-os mais dinâmicos, pois podem ser vinculados em tempo de execução. O código pode ser escrito em interfaces conhecidas, mas as classes reais a serem usadas podem ser instanciadas usando reflexão de arquivos de configuração


## Programação Defensiva

No dia a dia do desenvolvimento de sistemas, é comum trabalhar com entradas e saídas de dados, seja um toque na tela, uma informação digitada por um usuário ou qualquer outra coisa...

Em um mundo ideal, o usuário (ou cliente) sempre manda os dados certos para os serviços que irão processar esses dados (servidor), mas nem sempre isso acontece. Um exemplo muito básico é quando um usuário tenta se cadastrar em um sistema mandando as informações de nome e email, se isso for feito por um front-end é comum haver uma validação para verificar se o email é valido ou não, mas caso essa validação não seja feita também no servidor algumas inconsistências podem ocorrer.

O exemplo citado acima não oferece muito risco, mas é uma boa maneira de entender que não devemos confiar nos dados que são recebidos. Um exemplo mais comum que encaixa perfeitamente nessa situação é o SQL Injection. Trata-se de enviar comandos SQL para algum serviço com a intenção de mudar o comportamento esperado e conseguir executar algum comando no SGBD utilizado pelo sistema. Por isso uma maneira de usar a programação defensiva é sempre encapsular o valor que vem do cliente dentro de uma string (por exemplo), e não concatenar o valor direto na query que será executada no banco

Recomendado:
``` 
String sql = "SELECT * FROM users WHERE email = ?"
PreparedStatement stmt = conn.prepareStatement(sql);
stmt.setString(1, email);
ResultSet results = stmt.executeQuery(sql);
```

Não recomendado
``` 
String sql = "SELECT * FROM users WHERE email = '" + email + "'";
ResultSet results = stmt.executeQuery(sql);
```

