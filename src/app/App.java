package app;

import utils.SignValidator;

public class App {
    public static void main(String[] args) throws Exception {
        SignValidator validator = new SignValidator();

        System.out.println();
        System.out.println("Ejercicio 01: Validacion de signos");
        System.out.println("Cadena: {[()]} | Resultado: " + validator.isValid("{[()]}"));
        System.out.println("Cadena: {[(])} | Resultado: " + validator.isValid("{[(])}"));
    }
}
