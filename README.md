# Ejercicios de lógica con estructuras lineales: pilas y colas
## Nombres de integrantes:
### William Berrezueta, Angelo Altamirano, Sebastian Cabrera.

## Descripción:

En este proyecto nos pisieron aplicar el uso de estructuras de datos lineales, en concreto Stacks(pilas) y Queues(colas), mediante resolver 3 distintos ejercicios prácticos.
En cada ejercicio implementamos un algoritmo, respetando las restricciones establecidas, sin utilizar soluciones ya incorporadas en la biblioteca de Java.
Todos los ejercicios se ejecutaron en una única clase principal (App.java), mostrando en consola los resultados obtenidos y verificar su funcionamiento.

## Explicación del Ejercicio 01.

En este ejercicio se verifica si una cadena de paréntesis, llaves y corchetes está correctamente implementada utilizando una pila(Stack).
El algoritmo recorre la cadena de carácteres y cuando encuentra un símbolo de apertura, lo alamacena en la pila con un push, y cuando encuentra un símbolo de cierre, verifica que exista un elemento en la pila, extrae el ultimo con pop() y comprueba que ambos sean del mismo tipo, sino coinciden o la pila esta vacia, la cadena es inválida.

## Explicación del Ejercicio 02.

Este ejercicio ordena un Stack de enteros utilizando únicamente otra pila axuliar, sin convertir los datos a arreglos o listas.
el algoritmo esxtrae los elementos, los compara y los coloca en la posicion correcta dentro de la pila axuliar, al final, los deveulve al stack original, quedando ordenados con el menor elemento tope.

## Explicación del Ejercicio 03.
