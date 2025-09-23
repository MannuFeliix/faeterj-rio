package POB.lista02.ex09;

import java.util.Scanner;

public class ex09
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a primeira nota?");
        int nota1 = entrada.nextInt();

        System.out.println("Qual a segunda nota?");
        int nota2 = entrada.nextInt();

        float media = (nota1+nota2)/2;
         
        if( media>= 7) 
        {
            System.out.println("APROVADO!");
        
        }
        else
        {
            System.out.println("Qual é a terceira nota?");
            int nota3 = entrada.nextInt();

            media = (media + nota3 *2)/3;

            if (media >= 6)
            {
                System.out.println("APROVADO!");

            }
            else 
            {
                System.out.println("REPROVADO");

            }
        
        }

        entrada.close();
        
    }
    
}

