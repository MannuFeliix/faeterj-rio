package POB.lista01.ex03;

import java.util.Scanner;

public class ex03 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor em Celsius: ");

        float c = entrada.nextFloat();
        float f = (c*9/5)+32;

        System.out.println("O valor em Fahrenheit é: " + f );

        entrada.close();
        
    }
    
}
