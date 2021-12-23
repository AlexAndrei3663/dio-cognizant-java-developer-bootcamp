# Anotações feitas duranote o curso Introdução ao Git e ao Github

## Comandos de terminal em diferentes sistemas operacionais
| Comando | Windows |   Linux   |
| :---    | :---:   |   ---:    |
| Listar arquivos | dir | ls |
|Mudar de diretorio| cd| cd|
|Criar diretorio| mkdir | mkdir|
|Apagar arquivos|del|rm -rf|
|Apagar diretorios|rmdir|rm -rf|
|Limpar a tela|cls|clear (ctrl+l)|

## Comandos para gerar chave SSH
Gerando as chaves publica e privada:
- ssh-keygen -t ed25519 -C "email"

Iniciando agente:
- eval $(ssh-agent -s)
- ssh-add id25519

## Comandos para o Git
Inicializando o git
- git init

Configuração inicial do git
- git config --global user.email ""email""
- git config --global user.name "nome"

Preparar arquivos para commit
- git add "arquivos" (obs: * pode ser usado para refenciar todos os arquivos de uma vez)

Gerando commit
- git commit -m ""texto do comentario""

Visualizando configurações do Git local
- git config --list

Fazendo um push
- git push origin main

Fazendo um pull
- git pull origin main

Clonando um repositorio
- git clone "link do clone do repositorio"

Relacionar o repositório local com o do GitHub
- git remote add origin "link do repositorio"