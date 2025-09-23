package POB.lista01.ex09;

import java.util.Scanner;

//Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. O programa deve calcular e exibir o valor equivalente em dólares (US$).
public class ex09 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual valor em reais(R$)? ");
        float reais = entrada.nextFloat();

        System.out.println("Qual a cotação do dólar(US$ -> R$)? ");
        float cotacao = entrada.nextFloat();

        float dolar = reais/cotacao;

        System.out.println("O seu valor em dólar é US$"+dolar);

        entrada.close();
        
    }
    
}
