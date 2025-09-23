package POB.lista01.ex04;

import java.util.Scanner;

public class ex04 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com as três notas: ");

        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();

        float media = (nota1+nota2+nota3)/3;

        System.out.println("A média aritmética é: "+media);

        entrada.close();
        
    }
    
}
