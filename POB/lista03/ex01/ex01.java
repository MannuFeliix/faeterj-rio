/* Exercício 1: Soma dos N primeiros números naturais
Descrição:
Crie um programa que solicite ao usuário um número N e utilize um loop for
para calcular a soma dos primeiros N números naturais.
Requisitos:
• O programa deve utilizar um contador para iterar de 1 até N.
• Deve utilizar um acumulador para somar os valores sucessivos.
• Ao final, exibir a soma total. */

package POB.lista03.ex01;

import java.util.Scanner;

public class ex01 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        int acumulador = 0;


        for(int i = 1; i <=num ; i++)
        { 
            acumulador += i;
        }

        System.out.println("A soma final é "+ acumulador);

        entrada.close();
        
    }
    
}
