package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrome {
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
}