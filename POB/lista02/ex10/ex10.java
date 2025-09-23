package POB.lista02.ex10;

import java.util.Scanner;

public class ex10
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o ano de nascimento: ");
        int ano = entrada.nextInt();

        int idade = 2025 - ano;

        System.out.println("Qual é o seu sexo?(1- masculino | 2 - feminino)");
        int sexo = entrada.nextInt();



        if( sexo==1 && idade>=18) 
        {
            System.out.println("Serviço militar obrigatório!");
        
        }
        else
        {
            System.out.println("Isento de serviço militar!");
        }

        entrada.close();
        
    }
    
}

