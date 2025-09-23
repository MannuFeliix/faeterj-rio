package POB.lista02.ex07;

import java.util.Scanner;

public class ex07
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o número?");
        int num = entrada.nextInt();
         
        if( num>0) 
        {
            System.out.println("É positivo!");
        
        }
        else if(num == 0)
        {
            System.out.println("É nullo");
        }
        else 
        {
            System.out.println("É negativo");
        }

        entrada.close();
        
    }
    
}

