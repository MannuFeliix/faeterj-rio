package POB.lista02.ex06;

import java.util.Scanner;

public class ex06
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o seu sexo?(1- masculino | 2 - feminino)");
        int sexo = entrada.nextInt();

        System.out.println("Qual é o seu salário bruto?");
        float salario = entrada.nextFloat();
         
        if( sexo==1) 
        {
            salario *= 0.95;
            System.out.println("Seu salário líquido é de R$"+ salario);
        
        }
        else
        {
            salario *= 0.97;
            System.out.println("Seu salário líquido é de R$"+ salario);
        }

        entrada.close();
        
    }
    
}

