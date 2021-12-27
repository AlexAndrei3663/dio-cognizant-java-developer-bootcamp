# Anotações feitas duranote o curso Variáveis, Tipos de Dados e Operadores Matemáticos em Java

## Tipos de dados e seus tamanhos
byte: 8 bits, -128 até 127<br/>
short: 16 bits, -32.768 até 32.767<br/>
int: 32 bits, -2.147.483.648 até 2.147.483.648<br/>
long: 64 bits, -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807<br/>
float: 32 bits, $\pm 3.4028237 \times 10^{38}$<br/>
doable: 64 bits, $\pm 1.7976931 \times 10^{308}$

## Tabela de prioridade de execução de operadores matemáticos
|Operador|Precedência|
|:---|:---|
|Pós-fixado|exp++, exp--|
|Pre-fixado|++exp, --exp|
|Multiplicativo|*, /, %|
|Aditivo|+, -|
|Atribuição|=, +=, -=, *=, /=, %=|

## Tabela de converção de tipos de dados
|||byte|short|char|int|long|float|double|
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|byte||---|U - I|char|U - I|U - I|U - I|U - I|
|short||D - E|---|char|U - I|U - I|U - I|U - I|
|char||D - E|D - E|---|U - I|U - I|U - I|U - I|
|int||D - E|D - E|D - E|---|U - I|U - I|U - I|
|long||D - E|D - E|D - E|D - E|---|U - I|U - I|
|float||D - E|D - E|D - E|D - E|D - E|---|U - I|
|double||D - E|D - E|D - E|D - E|D - E|D - E|---|

Legenda:
U - Upcast;
I - Implícito;
D - Downcast;
E - Explicito;