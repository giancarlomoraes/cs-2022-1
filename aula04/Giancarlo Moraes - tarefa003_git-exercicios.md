### Tarefa 003: Git Exercícios - 03/06/2021.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?
git --version
2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
    Exibe uma lista com todos os "parâmetros" do git e uma lista dos comandos mais comuns utilizados
  b. git help checkout
    Abre uma página HTML com a documentação do comando checkout
  c. git help merge
    Mesma coisa que o `git help checkout`, mas com a documentação do comando merge
  d. git init
    Inicializa um repositório local
  e. git add --all
    Adiciona todos os arquivos (modificados, novos e excluídos) para o "stage" atual
  f. git add -u
    Similar ao -all, mas com a flag -u, apenas os arquivos modificados e excluídos são afetados
  g. git config -l
    Lista as variáveis (credenciais) que estão configuradas para o git e seus respectivos valores
  h. git mv a.txt b.txt
    Geralmente é usado quando queremos trocar o nome do arquivo, mas sem ter que adicionar um novo (com o mesmo conteúdo) e remover o antigo, com o comando `git mv` nós renomeamos um arquivo, mas o conteúdo permanece o mesmo
  i. git reset --hard
    De maneira simples, ele descarta tudo que não está sendo "trackeado", ou seja, apaga os commits que ainda não foram mandados, a área de stage e as modificações
  j. git log -27
    Visualiza os últimos 27 commits
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
git add <arquivos> (podemos colocar o -all ou um . para inserir todos os arquivos) e git commit
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
git show, mostra todas as alterações
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
git status
6. Qual o comando para efetuar um _commit_?
git commit (para adicionar um comentário podemos passar a flag -m e o comentário entre aspas)
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
git checkout --nomedoarquivo
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
Devemos criar um arquivo .gitignore e adicionarmos nossas pastas lá, exemplo /tmp
9. O que acontece se o seu repositório local for acidentalmente removido?
As mudanças locais são perdidas, porém o repositório remoto permanece intacto, basta clonar novamente
10. Como clonar um repositório remoto?
Utilizando o comando `git clone`
11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
git log --oneline
12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
.gitconfig
13. Qual o comando para criar um repositório local?
`git init` dentro do diretório.
14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
.git
15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
git add --all
16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
O SHA1 é um mecanismo para manter a integridade dos arquivos e dar a confiança de que é impossível alterar um arquivo sem que o git saiba. O Git utiliza o hash SHA1 para poder fazer o checksum e manter as informações seguras.
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
Não entendi
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
Não, apenas os arquivos que foram editados
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
Primeiro irá remover o último commit daquela branch, mas os arquivos permanecerão na máquina, o segundo irá excluir todas as suas alterações naquela branch
20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
git clean -f -d
21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
.gitignore
22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
Colocamos o *.class, assim o git saberá que tudo que acabar com .class deve ser ignorado
23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
Mostra o nome e email dos usuários que contribuíram no projeto(?)
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
Mostra o link do repositório remoto (nesse caso o link do repositório no github)
26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
git tag
27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
git tag -l "2.0"
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
Cria a tag "3.4-gold" com a descrição "minha versão ouro"
29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
Mostra as informações dos commits daquela tag
30. O que o comando **git push origin 3.4-gold** teria como efeito?
Atualizará o repositório remoto para a versão 3.4-gold
31. Após executar um commit, qual o efeito de **git commit --amend**?
Serve para alterar o commit anterior, podendo fazer modificações nos arquivos e do comentário do commit
32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
Remove as alterações do arquivo x.txt do stage
33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
Descarta as mudanças feitas no arquivo
34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
o reset tira o a.txt do stage, ou seja, ele para de ser "trackeado" e o checkout apenas descartas as mudanças
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.
