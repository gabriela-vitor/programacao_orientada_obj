import java.until.Scanner;
import java.lang.Math;

public class Bhaskara{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double a, b, c, x1, x2, delta;
        
        System.out.println("Escreve o numero a: ");
        a = entrada.nextDouble();
        
        System.out.println("Escreve o numero b: ");
        b = entrada.nextDouble();
        
        System.out.println("Escreve o numero c: ");
        c = entrada.nextDouble();
        
        delta = (b * b) - (4 * a * c);
        
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        System.out.printf("O resultado de x1 e x2 e: %.1f e %.1f", x1, x2);
            
        } 
        }

