package POB.lista02.ex02;

import java.util.Scanner;

public class ex02 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a sua idade?");

        int idade = entrada.nextInt();

        if( idade>= 18) 
        {
            System.out.println("Maior de idade");
        
        }
        else
        {
            System.out.println("Menor de idade");
        }

        entrada.close();
        
    }
    
}

