package POB.lista02.ex04;

import java.util.Scanner;

public class ex04
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int a = entrada.nextInt();

        if( a%2==0) 
        {
            System.out.println("O número é PAR");
        
        }
        else
        {
            System.out.println("O número é ÍMPAR");
        }

        entrada.close();
        
    }
    
}

