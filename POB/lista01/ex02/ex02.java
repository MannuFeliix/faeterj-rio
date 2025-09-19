package POB.lista01.ex02;

import java.util.Scanner;

public class ex02 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o raio: ");

        float raio = entrada.nextFloat();
        float area = (float)3.14159*raio*raio;

        System.out.print("A área do círculo é: " + area + "\n");

        entrada.close();

        
    }

    
}
