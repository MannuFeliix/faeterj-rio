package POB.lista01.ex06;

import java.util.Scanner;

public class ex06_02 
{
     public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor do seu salário:");
        float salario = entrada.nextFloat();
        
        System.out.println("Entre com o valor do desconto do INSS em porcentagem:");
        float percent = entrada.nextFloat();

        percent = percent/100; //percent /=100

        float salarioLiquido = salario-percent;

        System.out.println("O valor do sálario com o desconto é R$"+salarioLiquido);

        entrada.close();

    }
    
}
