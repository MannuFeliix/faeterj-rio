package POB.lista01.ex07;

import java.util.Scanner;

public class ex07 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor da base: ");
        int base = entrada.nextInt();
        
        System.out.println("Entre com o valor da altura: ");
        int altura = entrada.nextInt();

        int area = base*altura;

        System.out.println("A área do retângulo é: "+area);

        int perimetro = 2 *(base+altura);

        System.out.println("O perímetro do retângulo é: "+perimetro);

        entrada.close();
        
    }
    
}
