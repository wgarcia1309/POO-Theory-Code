## Proyecto Teoría de códigos
### POO-Theory-Code
En la siguiente planteamos el reto a resolver, es buscar un espacio vectorial es decir un código “C” el cual cumpla con determinados parámetros que el usuario solicita, con la siguientes nomenclaturas:

#### C[n,k,d]
_donde “n” es la longitud, “k” es la dimensión y “d” es distancia mínima_

#### C(n,m,d)
_donde “n” es la longitud, “m” es el tamaño y “d” es distancia mínima_

Partiendo de un cuerpo o campo Fq en el que un principio trabajaremos con “q” como un número primo,y dado a que es primo se cumple que
		
```
Zq={0,1,...,q-1}
``` 
A partir de Zq se crean unas tablas para poder sumar y multiplicar:


|  +| 0 |...|q-1|
| ------ | ------ | ------ | ------ |
| 0 | (0+0)%q|...|(0+q-1)%q|
| ... |...|...|...|
| q-1 |(q-1+0)%q |...|(q-1+q-1)%q|

| * | 0 |...|q-1|
| ------ | ------ | ------ | ------ |
| 0      |(0 * 0)%q)| ...|( 0 * (q-1) )%q|
| ... |...|...|...|
| q-1 |( (q-1) * 0)%q |...|( (q-1) * (q-1) )%q|


Para ser más prácticos si mostramos la suma en  q=3

| + | 0 |1 |2|
| ------ | ------ | ------ | ------ |
|0|0|1|2|
|1|1|2|0|
|2|2|0|1|

Ahora es necesario encontrar k vectores que generen un número determinado de m parejas
Los cuales se van a seleccionar escogiendo todas las combinaciones de k vectores (Zq)^n hasta que sean Linealmente Independientes  y tenga distancia mínima d.
```
Base={ K1 , k2 , ... , Kn }
``` 

Encontrar la distancia mínima (d), es muy simple es solamente verificar todos los puntos del conjunto solución del sistema, suponiendo que el conjunto solución fuese:
```
s={ (1,0,0) , (1,1,0) , (0,0,0) , (0,1,0) }
```

- D( (1,0,0) , (1,1,0) )=1 
- D( (1,0,0) , (0,0,0) )=1 
- D( (1,0,0) , (0,1,0) )=2

Nos indica que la distancia mínima será el número de coordenadas difieren, se escoge la menor en este caso 1.
