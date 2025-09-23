package POB.lista01.ex08;

import java.util.Scanner;

public class ex08 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o valor do raio? ");
        float raio = entrada.nextFloat();

        float pi = (float)3.14159; 
        float volume = (4/3) * pi * (raio*raio*raio);

        System.out.println("O volume da esfera é: "+volume+ "cm³" );

        entrada.close();
        
    }
}
