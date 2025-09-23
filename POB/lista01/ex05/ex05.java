package POB.lista01.ex05;

import java.util.Scanner;

public class ex05 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Qual é a sua idade? ");

        int idade = entrada.nextInt();
        idade = idade*365;

        System.out.println("A idade aproximada em dias é: "+idade);

        entrada.close();
        
        
    }
    
}
