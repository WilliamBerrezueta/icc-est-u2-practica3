package app;

import java.util.Stack;

import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        SignValidator validator = new SignValidator();

        System.out.println();
        System.out.println("Ejercicio 01: Validacion de signos");
        System.out.println("Cadena: {[()]} | Resultado: " + validator.isValid("{[()]}"));
        System.out.println("Cadena: {[(])} | Resultado: " + validator.isValid("{[(])}"));

        System.out.println();
        System.out.println("Ejercicio 02: Ordenar Stack");
        Stack<Integer> stack = new Stack<>();
 
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);
 
        
        System.out.println("Stack original: " + stack);
 
        StackSorter sorter = new StackSorter();
        sorter.sortStack(stack);
 
        System.out.println("Stack ordenado: " + stack);
        System.out.println("Tope esperado: " + stack.peek());
    }
}