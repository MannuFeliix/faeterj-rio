/* Exercício 3: Contagem regressiva usando do-while
Descrição:
Crie um programa que solicite um número ao usuário e faça uma contagem
regressiva até 0, utilizando um loop do-while.
Requisitos:
• O programa deve solicitar um número inteiro positivo ao usuário.
• Utilizar um contador decrescente para reduzir o valor até 0.
• Exibir os números da contagem regressiva um por um.*/

package POB.lista03.ex03;

import java.util.Scanner;

public class ex03 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        do 
        {
            System.out.println(num);
            num--;


        }
        while(num>=0);

        entrada.close();
        
    }
    
}
