package POB.lista02.ex03;

import java.util.Scanner;

public class ex03
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int a = entrada.nextInt();

        System.out.println("Entre com o segundo número: ");
        int b = entrada.nextInt();

        if( a>= b) 
        {
            System.out.println("A é maior");
        
        }
        else
        {
            System.out.println("B é maior");
        }

        entrada.close();
        
    }
    
}

