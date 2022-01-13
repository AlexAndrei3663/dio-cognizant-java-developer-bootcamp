# Anotações feitas duranote o curso Variáveis, Tipos de Dados e Operadores Matemáticos em Java

## Tipos de dados e seus tamanhos
|Tipo|Tamanho|Valor min|Valor Max|Precisão|
|:---|:---:|:---|:---|:---:|
|boolean|1 bit|false|true|--|
|byte|1 byte|-128|127|--|
|short|2 bytes|-32.768|32.767|--|
|int|4 bytes|-2.147.483.648|2.147.483.648|--|
|long|8 bytes|-9.223.372.036.854.775.808|9.223.372.036.854.775.807|--|
|float|4 bytes|-3.4028237 e+38|3.4028237 e+38|6-7 dígitos|
|doable|8 bytes|-1.7976931 e+308|1.7976931 e+308|15 dígitos|

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