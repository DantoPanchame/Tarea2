
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {
     
    public static void main(String[] args) {
       int n;
        Scanner cadena= new Scanner(System.in);
        System.out.println("Ingrese valores:");
        String cad= cadena.nextLine();
    
       if (cad.charAt(2)=='+')
        {
            n=(cad.charAt(0))+(cad.charAt(4));
            System.out.println(n);
        }
        
       if (cad.charAt(2)=='-')
       {
           n=(cad.charAt(0))-(cad.charAt(4));
           System.out.println(n);
       }   
       if (cad.charAt(2)=='*')
       {
           n=(cad.charAt(0))*(cad.charAt(4));
           System.out.println(n);
       }
       if (cad.charAt(2)=='/')
        {
            n=((cad.charAt(0))/(cad.charAt(4)));
            System.out.println("");
        }
       else 
       {System.out.println("Operador no valido"); }
        
    }
    
    
}
