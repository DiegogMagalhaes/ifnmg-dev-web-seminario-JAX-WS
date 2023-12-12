# RpgDiceService

Projeto realizado para um seminario da Disciplina Desenvolvimento Web, sobre o tema de Jakarta XML Web Service. 

## Funcionalidades
- `` rolar um d20, com soma de modificador ``

## Configurações de Client:

1. O pom.xml do projeto que deseja consumir o RpgDiceService devera implementar o plugin: ``jaxws-maven-plugin``. Assim como visto no RpgDiceClientExample
2. O pom.xml do projeto que deseja consumir o RpgDiceService devera implementar as dependencias:
   - ``jakarta.xml.ws-api``
   - ``jaxws-rt``
   - ``jaxws-ri``
3. Rode o Maven Clean no projeto
4. Rode o Maven Install
5. Pronto!

Obs: Para utilizar o Service sera necessario roda-lo em sua maquina, executando a classe App de RpgDiceService
