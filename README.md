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

En este esjercicio se determina si una palabra o frase es un palíndromo utilizando colas (Queue).
Este algoritmo almacena los caracteres en colas y aprovecha su funcionamiento FIFO para realizar las comparaciones necesarias, sin comparar directamente el texto con una versión invertida.
Si todos los caracteres coinciden, el método devuelce true; del lo contrario, devuelve false;

## Bloque de codigo:

### Ejercicio 01:
````java
public boolean isValid(String aux){

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < aux.length(); i++){
            char c = aux.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char ultimo = stack.pop();
                if(c == ')' && ultimo != '('){
                    return false;
                }
                if(c == ']' && ultimo != '['){
                    return false;
                }
                if(c == '}' && ultimo != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
````
## Salida:
````java
Ejercicio 01: Validacion de signos
Cadena: {[()]} | Resultado: true
Cadena: {[(])} | Resultado: false
````
## Observación:
### El codigo valida correctamente signos válidos e inválidos.

### Ejecicio 02:
````java
public void sortStack(Stack<Integer> stack) {
        Stack<Integer> aux = new Stack<>();
 
        while (!stack.isEmpty()) {
            int temp = stack.pop();
 
            while (!aux.isEmpty() && aux.peek() > temp) {
                stack.push(aux.pop());
            }
 
            aux.push(temp);
        }
 
        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
    }
````
## Salida:
````java
Ejercicio 02: Ordenar Stack
Stack original: [2, 4, 1, 5]
Stack ordenado: [5, 4, 2, 1]
Tope esperado: 1
````
## Observación:
### El algoritmo ordeno el stack de forma correcta sin utilizar arreglos ni ordenamientos de Java, dejando los elementos en el orden esperado.

### Ejecicio 03:
````java
public boolean isPalindrome(String texto) {
        texto = texto.toLowerCase().replace(" ", "");

        Queue<Character> original = new LinkedList<>();
        Queue<Character> invertida = new LinkedList<>();
        Queue<Character> auxiliar = new LinkedList<>();

        for(int i = 0; i < texto.length(); i++){
            original.offer(texto.charAt(i));
            auxiliar.offer(texto.charAt(i));
        }
        while(!auxiliar.isEmpty()){
            int vueltas = auxiliar.size() - 1;
            for(int i = 0; i < vueltas; i++){
                auxiliar.offer(auxiliar.poll());
            }
            invertida.offer(auxiliar.poll());
        }
        while(!original.isEmpty()){
            if(!original.poll().equals(invertida.poll())){
                return false;
            }
        }
        return true;
    }
````
## Salida:
````java
Ejercicio 03: Palindromo usando colas
Anita lava la tina | Resultado: true
Hola mundo | Resultado: false
Luz azul | Resultado: true
````
## Observación:
### Se comprueba correctamente si una frase es palíndroma usando solo colas.

# Conclusiones:

- Conclusión 1: Aprendimos a usar pilas para validar signos y comprobar si están correctamente cerrados.
- Conclusión 2: Se puede ordenar un Stack sin usar `sort()`, utilizando una pila auxiliar.
- Conclusión 3: Las colas también pueden usarse para comparar caracteres y verificar si una frase es palíndroma sin necesidad de stack.
