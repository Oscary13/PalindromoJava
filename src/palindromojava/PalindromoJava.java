/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromojava;

import java.util.Scanner;

/**
 *
 * @author oscary
 */
public class PalindromoJava {
    
    public static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(IsPalindromo());
        
    }
    
    public static String IsPalindromo(){
        
        String palabra, palabraAlReves ="";
        
        System.out.println("Ingresa iuna frase o palabra:");
        palabra = scanner.nextLine().toLowerCase().replaceAll("\\s", "");
        
        
        for(int i = palabra.length()-1; i >= 0 ; i--){
            palabraAlReves = palabraAlReves +""+ palabra.charAt(i);
        }
        
        System.out.println(palabra);
        System.out.println(palabraAlReves);
        return (palabra.equals(palabraAlReves))? "La palabra es palindromo":"La palabra no es palindromo";
        
    }
    
}
