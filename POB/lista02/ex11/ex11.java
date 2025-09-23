package POB.lista02.ex11;

import java.util.Scanner;

public class ex11
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
            System.out.println("Forma triângulo");
        }

        entrada.close();
        
    }
    
}

