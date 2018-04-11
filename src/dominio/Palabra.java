/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Scanner;

/**
 *
 * @author Alfred
 */
public class Palabra {
    public void contarVocales(){
        
                int contadorVocales=0;
                Scanner scan = new Scanner(System.in);
                System.out.println("ingres cadena");
                String cadena=scan.nextLine();
                String cadenaAux = cadena.toLowerCase();
                for(int i=0;i<cadenaAux.length();i++){
                if((cadenaAux.charAt(i)=='a')||(cadenaAux.charAt(i)=='e')||(cadenaAux.charAt(i)=='i')||(cadenaAux.charAt(i)=='o')||(cadenaAux.charAt(i)=='u'))   
                contadorVocales++;
                }
                System.out.println("la cantidad de vocales en la cadena es: "+contadorVocales);
                            
                }
    public void invertirCadena(){
    
    Scanner scan = new Scanner(System.in);
    System.out.println("ingres cadena");
    String cadena=scan.nextLine();
    String cadenaInvertida="";
    
    for(int i = cadena.length()-1;i>=0;i--){
    cadenaInvertida+=cadena.charAt(i);
    }
        System.out.println("la cadena invertida es :"+cadenaInvertida);
    
    }
    public void contarCaracter(){
        int contador=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("ingres cadena");
        String cadena=scan.nextLine();
        System.out.println("ingrese caracter");
        char caracter=scan.next().charAt(0);
   
    
    for(int i = 0;i<cadena.length();i++){
        if (caracter == cadena.charAt(i)) {
            
            contador++;
        }
    
    }
        System.out.println("la cantidad de veces que el caracter aparece es :"+ contador);
    
    }
    public void compararCadenas(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ingres cadena");
        String cadena=scan.nextLine();
        System.out.println("Ingrese otra cadena a comparar");
        String cadena2=scan.nextLine();
        if (cadena.equals(cadena2)) 
            System.out.println("Cadenas iguales");
            else 
               System.out.println("Cadenas distintas");      
    
    }
    public void compararTOCadenas (){
        Scanner scan = new Scanner(System.in);
        System.out.println("ingres cadena");
        String cadena=scan.nextLine();
        System.out.println("Ingrese otra cadena a comparar");
        String cadena2=scan.nextLine();
        if (cadena.compareTo(cadena2)> 0) 
            System.out.println("La Cadena 1 es mayor");
            else 
               System.out.println("La Cadena 2 es mayor ");      
    
    
    
    }
    public void convertirValor(){
    
    Scanner scan = new Scanner(System.in);
        System.out.println("ingres entero");
        int cadena=scan.nextInt();
        String entero = String.valueOf(cadena);
        System.out.println("conversion de entero a cadena" + entero);   
    
    
    }
    
    
    
    
}
