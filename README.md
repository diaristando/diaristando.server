# diaristando.server

## Running the application

## Incluindo um novo módulo

* Crie um novo diretório que contenha um arquivo build.gradle
* Adicione suas dependências
* Se suas classes devem ser escaneadas pelo spring (são beans):
    * Crie-as dentro do pacote br.org.diaristando packages OU adicione o pacote @ComponentScan na classe principal da aplicação
* Inclua o módulo dentro do settins.gradle
    * ex: include "nome-modulo"