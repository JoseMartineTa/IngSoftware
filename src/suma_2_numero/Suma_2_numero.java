
package suma_2_numero;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Suma_2_numero {

    
    public static void main(String[] args) {
     
        int num1,num2,resultado;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("INGRESE EL PRIMER NUMERO");
        num1=Teclado.nextInt();
        
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        num2=Teclado.nextInt();
        
        resultado=num1+num2;
        
        System.out.println(" La suma de:" + num1 + " + " + num2 + " = " + resultado);
    }
    
}
