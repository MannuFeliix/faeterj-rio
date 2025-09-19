package POB.lista01.ex01;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com dois números inteiros: ");

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        int soma = num1 + num2;
        

        System.out.println("Soma = " + soma);

        entrada.close();
    }
}