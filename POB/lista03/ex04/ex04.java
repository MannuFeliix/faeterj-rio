/* Exercício 4: Média de notas de uma turma

Descrição:
Desenvolva um programa que calcule a média das notas de uma turma, onde
o usuário informe quantos alunos há na turma e suas respectivas notas.
Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma.*/

package POB.lista03.ex04;

import java.util.Scanner;

public class ex04 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int aluno = entrada.nextInt();

        float soma = 0;
        
        for(int i = 0; i < aluno; i++)
        {
            System.out.print("Entre com a nota do aluno: ");
            float nota = entrada.nextFloat();

            soma += nota;

        }

        float media = soma/aluno;

        System.out.println("A média da turma é: "+media);

        entrada.close();
        
    }
    
}
