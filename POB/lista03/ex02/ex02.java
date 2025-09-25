/* Exercício 2: Tabuada de um número
Descrição:
Escreva um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10, utilizando um loop while.
Requisitos:
• O programa deve pedir um número inteiro ao usuário.
• Utilizar um contador para iterar de 1 a 10.
• Exibir a multiplicação do número pelo contador em cada iteração. */

package POB.lista03.ex02;

import java.util.Scanner;

public class ex02 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        int contador = 1;
        while(contador<=10)
        { 
            System.out.println(num+" x "+contador+" = "+ (contador*num));
            contador++;
        }

        //for equivalente
        //for(contador = 1; contador <=10; contador++);

        entrada.close();
        
    }
    
}
