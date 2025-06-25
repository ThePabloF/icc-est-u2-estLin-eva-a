package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {

        Stack<String> pila = new Stack<>();

        if (!cola.isEmpty()) {
            for (String nombre : cola) {
            pila.add(nombre);
            }

            while(!pila.isEmpty()){
                cola.add(pila.pop());
            }

            return cola;
        }

        


        return null; // Simulación de resultado
    }

    /**
     * Verifica si la palabra formada por los elementos de una cola es un
     * palíndromo.
     *
     * Se considera que la cola contiene letras individuales como strings.
     * Ejemplo:
     * Entrada: ["r", "a", "d", "a", "r"] → true
     * Entrada: ["c", "a", "s", "a"] → false
     *
     * @param cola Cola de letras en minúsculas
     * @return true si forman un palíndromo, false si no
     */
    public boolean verificarPalindromoCola(Queue<String> cola) {
        
        Stack<String> pila = new Stack<>();
        Queue<Character> colaAux = new LinkedList<>();

        for(String letra: cola){
            pila.push(letra);
            colaAux.add(pila.peek());
        }
        return false;
    }





    public boolean verificarPalindromo(String palabra){
       Stack<Character> pila = new Stack<>();
       Queue<Character> cola = new LinkedList<>();

       for(Character letra : palabra.toCharArray()){
            pila.push(letra);
            cola.add(letra);
        }

        while (!pila.isEmpty() && !cola.isEmpty()) {
            if (pila.pop().charValue() != cola.remove().charValue()) {
                return false;
            }

        }
        return true;

    }
    public String invertirCadena(String texto) {
        char[] cadena = texto.toCharArray();
    
        Stack<Character> cStack = new Stack<>();
    
        Stack<Character> invertido = new Stack<>();

        StringBuilder sb = new StringBuilder();
        

        for (Character character : cadena) { 
            cStack.push(character);
        } 
        while (!cStack.isEmpty()) {
            char txt = cStack.pop();
            sb.append(txt);
        }
        

          
        return sb.toString();
    }

}
