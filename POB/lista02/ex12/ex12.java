package POB.lista02.ex12;

import java.util.Scanner;

public class ex12
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor de A: ");
        int a = entrada.nextInt();

        System.out.println("Entre com o valor de B: ");
        int b = entrada.nextInt();

        System.out.println("Entre com o valor de C:");
        int c = entrada.nextInt();


        if( a>(b+c) || b>(a+c) || c>(b+a)) 
        {
            System.out.println("Não forma triângulo");
        
        }
        else
        {
            if (a==b && b==c)
            {
                System.out.println("O triâgulo é Equilátero");

            }
            else if (a!=b && b!=c && a!=c)
            {
                System.out.println("O triâgulo é Escaleno");

            }
            else
            {
                System.out.println("O triâgulo é Isósceles");
                
            }
            
        }

        entrada.close();
        
    }
    
}

