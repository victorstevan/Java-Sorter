# Organizador de Arquivos em Java

Esse é um pequeno projeto de um script para organizar minha pasta de Downloads.
O projeto foi inicialmente feito em Dart, porém depois adaptei para Java.  
Não costumo programar em Java, porém talvez a estrutura do projeto não esteja das mais idiomáticas para a linguagem. Como o script foi feito para uso próprio não há muito cuidado com exceções ou arquitetura.  

  
Trata-se somente de um simples script executável.

## Como usar  
Utilize o comando maven 
```powershell
mvn dependency:resolve
```
Para buscar a dependencia relacionada ao Apache Common IO, na qual utiliza-se o FilenameUtils no projeto  

No camino `src\main\java\com\victorstevan\Model` modifique o arquivo `VictorSortingSystem.java`, podendo renomear-lo e modificar os parametros ao seu gosto.  

  
No ponto de entrada do script localizado no caminho `src\main\java\com\victorstevan\Main.java`, faça demais modificações caso tenha renomeado no passo anterior.  

Execute o Script!

## Obs
Como não uso Java, não conheço bem seu ecossistema, meu maior conselho parar utilizar o script facilmente seria simplesmente abrir esse projeto no IntelliJ e deixar que ele resolva as dependencias e execute por lá.