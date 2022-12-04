# Ecommerce
>
> Projeto para entender como é feita a integração com o banco de dados usando o SpringBoot.
>
---

## Português?
>
> Esse é um dos projetos em que o README será feito em português. O código do projeto (nome das variáveis, métodos, etc) foram todos criados nessa língua e, por isso, acredito que não faça sentido ter um README em inglês, por mais que normalmente use esta linguagem tanto nos códigos quanto nos README.
> Escrever o código em português foi o modo que encontrei para desenvolvê-lo de forma mais rápido. Querendo ou não, tenho mais dúvidas da grafia das palavras em inglês do que em português e parar para procurar como determinada palavra é escrita tomaria um tempo que não tinha para terminar as aulas que me apresentaram esta integração entre o banco de dados e o SpringBoot.
>
---

## Integração do Banco de Dados Usando o SpringBoot
>
> Este foi o meu primeiro contato integrando as duas tecnologias. Já havia mexido no MySQL outras vezes, mas sempre diretamente nele, nunca através de uma API.
> Por outro lado, considero essa a primeira vez que uso o SpringBoot (talvez a primeira vez literal tenha sido um ou dois dias antes). Portanto, meus conhecimentos sobre o funcionamento desse framework ainda precisam ser aprofundados.
>
---

## Problemas
>
> Apesar de ter copiado o exemplo dado em aula, ao chegar ao final de uma das etapas de construção da API Rest (não me lembro bem qual), ela simplesmente não funcionou mais. Como disse anteriormente, o tempo era curto e, por isso, continuei com as aulas e escrevendo o código mesmo que não pudesse testá-lo no momento.
> 
> Ao chegar ao final do módulo e do projeto, mesmo já sabendo que a API apresentaria erro, tentei rodá-la mesmo assim. Obviamente não fui bem sucedida. Ao longo da semana, retornei ao código e tentei analisar o log de erro, porém não conseguia encontrar o que deveria ser corrigido na parte sinalizada. 
> 
> Assim, resolvi recorrer a colegas de uma comunidade que prontamente me ajudaram, chegando ao motivo do erro e me explicando o que houve e como solucioná-lo. Passei algumas horas nisso, mas finalmente consegui consertar o código e agora ele funciona (a versão que encontra-se aqui já foi atualizada).
> 
> Basicamente, o motivo do meu "erro" foi um import. Quando fui fazer a anotação @RestController como foi feita na aula, precisei fazer o import do javax.persistence.* . No entanto, minha IDE não o reconheceu. Isso me levou a fóruns que, numa das soluções, apontava que, caso a IDE não o reconhecesse, seria preciso implementar um determinado código no meu arquivo pom.xml (esse código está disponível em [Maven Repository](https://mvnrepository.com/artifact/javax.persistence/javax.persistence-api/2.2)).
> 
> Ao fazer isso, consegui fazer o import do javax.persistence.* , mas minhas anotações das entidades passaram a uma referência errada, comprometendo todo o funcionamento do código. Para solucionar o problema, deveria:
> 
> - Excluir o import javax.persistence.*;
> - Excluir todos os demais imports do código;
> - Reinserir todos os imports;
> - Importar o jakarta.persistence.* .
>
> Por que houve a necessidade de trocar o javax pelo jakarta? Pelo que o professor me explicou, o projeto JavaEE passou a fazer parte do repositório do Apache e, com isso, o import javax também. Por uma questão de marca, a Oracle fez uma alteração no nome, passando a chamá-lo de jakarta.
>
> Feitas as alterações necessárias, o código voltou a funcionar sem problemas. Fica aqui o meu agradecimento a todos que me ajudaram na resolução do problema. Sem vocês o código continuaria sem funcionar (pelo menos por mais algum tempo) e eu não teria aprendido tudo que aprendi com a solução do problema.
---

## Implementações Futuras
>
> Se observarem o código postado, verão que a pasta "dto" não teve a sua implementação. Isso foi feito em aula, porém era um dos motivos pelo erro apresentado ao rodá-lo. Assim, optei por deixar a pasta e o código ainda presentes, bem como os métodos implementados, mas comentados.
>
> Como essa foi a minha primeira vez desenvolvendo uma Rest API, achei suficiente o código ir até o final da sua integração com o banco de dados. A dto, portanto, ficará para uma atualização futura.
>
> Outra atualização a ser feita será com relação ao banco de dados. Neste projeto, usei o MySQL como banco de dados. O código não está contido aqui no repositório ainda, pois precisa ser arrumado. Há implementações iguais e outras sem muito sentido inseridas nele e, por isso, preferi arrumar minimamente antes de subir o código. O adicionarei ao repositório o mais breve possível.
---

<a href="https://git-scm.com/" target="_blank"> 
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/git/git-original.svg" alt="css3" width="40" height="40"/> 
</a>
<a href="https://code.visualstudio.com/">
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vscode/vscode-original.svg" alt="vscode" width="40" height="40"/>
</a>
<a href="https://www.java.com" target="_blank"> 
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> 
</a>
<a href="https://www.mysql.com/" target="_blank"> 
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/> 
</a> 
<a href="https://spring.io/" target="_blank"> 
    <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> 
</a>

---

![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![IMarkdown](https://img.shields.io/badge/Markdown-000000?style=for-the-badge&logo=markdown&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

---

[![GitHub SEU NOME]( https://img.shields.io/github/followers/AmandaPardinho?label=follow&style=social)](https://github.com/AmandaPardinho)

