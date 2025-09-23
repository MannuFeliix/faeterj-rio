package POB.lista01.ex06;

import java.util.Scanner;

public class ex06 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor do seu salário:");
        float salario = entrada.nextFloat();
        
        System.out.println("Entre com o valor do desconto do INSS:");
        float desconto = entrada.nextFloat();

        float salarioLiquido = salario-desconto;

        System.out.println("O valor do sálario com o desconto é R$"+salarioLiquido);

        entrada.close();

    }
    
}
