package POB.lista02.ex08;

import java.util.Scanner;

public class ex08
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Em quantas disciplinas você não alcançou a média?");
        int disciplina= entrada.nextInt();
         
        if( disciplina == 0) 
        {
            System.out.println("APROVADO!");
        
        }
        else if(disciplina <=5)
        {
            System.out.println("RECUPERAÇÃO");
        }
        else 
        {
            System.out.println("REPROVADO");
        }

        entrada.close();
        
    }
    
}

