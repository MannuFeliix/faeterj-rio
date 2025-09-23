package POB.lista02.ex01;

import java.util.Scanner;

public class ex01 
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

        entrada.close();
        
    }
    
}
