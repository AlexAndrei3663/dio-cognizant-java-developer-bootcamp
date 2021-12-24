# Anotações feitas duranote o curso Dominando IDEs Java

## Caracteristicas do Java
### Sequencia de compilação do java
Programa.java -> Compilador -> Programa.class -> JMV -> 01010000 01110010 01101111 01100111 01110010 01100001 01101101 01100001

Primeiro escrevemos o codigo fonte. Depois, o compilador converte o programa em um arquivo bytecode. E por fim, o JMV interpreta o arquivo bytecode em linguagem de maquina.

### Plataformas Java
- Java SE (Java Plataform, Standart Edition) - Base da plataorma onde as bibliotecas comuns estão localisadas
- Java EE (Java Plataform, Enterprise Edition) -  Responsavel pelo desenvolvimento web
- Jama ME (Java Plataform, Micro Edition) - Responsavel pelo desenvolvimento de dismositivos moveis e embarcados

### Componentes Java
JDK (Java development Kit) - Responsavel por transformar o codigo em bytecode.<br/>
JRE (Java Run-time Envirement) - Ambiente de execulção do Java que fornece as bibliotecas padrão do Java.<br/> 
JVM (Java Virtual Machine) - Responsavel por converter o bytecode em linguagem de maquina para poder ser execultado.

### Ambientes de desenvolvimento (IDEs)
- Eclipse
- IntelliJ
- Netbeans
- VS code

## Instalando Java Ubuntu
Verificando versão do Java
```
java --vesion
```

Instalar o JDK
```
sudo apt-get install openjdk-17-jdk
```

### Configurando o ambiente JAVA_HOME
1. Verificando o caminho da instalação do Java
```
sudo update-alternatives --config java
```
2. Copie o caminho que aparece no terminal.
3. Abrindo o arquivo .bashrc
```
sudo gedit ~/.bashrc
```
E ao final do arquivo, cole seguinte texto:
```
JAVA_HOME=<coloque aqui o caminho copiado>
export JAVA_HOME
export PATH=\$PATH:\$JAVA_HOME
```
4. Salve e feche o arquivo

## Instalando Java Windows
1. Usaremos a distribuição do OpenJava Zulu. Então primeiro vamos [baixar](https://www.azul.com/downloads/?package=jdk) o instalador no site.
2. Se não existir uma pastas Java em arquivos de programas, criar e extrair os arquivos de instalação nela.
3. Copiar o caminho para a pasta zulu
```
C:\Program Files\Java\zulu17.30.15-ca-jdk17.0.1-win_x64
```
4. Criar uma nova variavel de ambiente com o nome JAVA_HOME e endereçar o caminho da pasta copiado.
5. Editar a variavel de ambiente Path. Nela vamos adicionar o caminho para a pasta que copiamos também. E adicionamos \bin ao final.
```
C:\Program Files\Java\zulu17.30.15-ca-jdk17.0.1-win_x64\bin
```
6. Por fim, movemos o caminho criado para o topo.


Referencia: [Curso dio dominando ides java](https://github.com/cami-la/curso-dio-dominando-ides-java/blob/master/README.md), por cami-la