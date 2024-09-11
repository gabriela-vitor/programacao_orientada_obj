import java.util.Scanner;

public class Quadrado{
    public static void main(String[] args){

        int lado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o tamanho do quadrado:");
        lado = entrada.nextInt();

        int contador = 1;
        int altura = 1;

        while (altura <= lado){
            int largura = 1;
            while(largura <= lado){

                if((altura > 1 && altura < lado) && (largura > 1 && largura < lado))
                    System.out.printf("   ");
                else
                    System.out.printf(" * ");

                largura++;
            }

            System.out.println(" ");
            altura++;
        }
    }
}
