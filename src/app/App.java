package app;

import java.util.Stack;

import utils.QueuePalindrome;
import utils.SignValidator;
import utils.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        runSignValidator();
        runStackSorter();
        runQueuePalindrome();
    }
    private static void runSignValidator() {
        SignValidator validator = new SignValidator();

        System.out.println();
        System.out.println("Ejercicio 01: Validacion de signos");
        System.out.println("Cadena: {[()]} | Resultado: " + validator.isValid("{[()]}"));
        System.out.println("Cadena: {[(])} | Resultado: " + validator.isValid("{[(])}"));
    }

    private static void runStackSorter() {
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
    private static void runQueuePalindrome() {
        System.out.println();
        System.out.println("Ejercicio 03: Palindromo usando colas");
        QueuePalindrome palindromeChecker = new QueuePalindrome();
        String texto1 = "Anita lava la tina";
        String texto2 = "Hola mundo";
        String texto3 = "Luz azul";
        System.out.println(texto1 + " | Resultado: " + palindromeChecker.isPalindrome(texto1));
        System.out.println(texto2 + " | Resultado: " + palindromeChecker.isPalindrome(texto2));
        System.out.println(texto3 + " | Resultado: " + palindromeChecker.isPalindrome(texto3));
    }
}