package POB.lista02.ex05;

import java.util.Scanner;

public class ex05
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o ano de nascimento: ");
        int ano = entrada.nextInt();

        int idade = 2025 - ano;

        if( idade>=16) 
        {
            System.out.println("APTO a ser eleitor");
        
        }
        else
        {
            System.out.println("Inapto");
        }

        entrada.close();
        
    }
    
}

