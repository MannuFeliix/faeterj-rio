package POB.lista01.ex10;

import java.util.Scanner;
import java.lang.*;

/* Distância Entre Dois Pontos : Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano e calcule a distância entre eles.

Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)*/ 

public class ex10 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Me fale a coordenada x1 :");
        double x1 = entrada.nextDouble();

        System.out.println("Me fale a coordenada y1:");
        double y1 = entrada.nextDouble();

        System.out.println("Me fale a coordenada x2 :");
        double x2 = entrada.nextDouble();

        System.out.println("Me fale a coordenada y2:");
        double y2 = entrada.nextDouble();


        int distancia = (int)Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));

        System.out.println("A distância entre os dois pontos é: "+distancia);

        entrada.close();
        
    }

    
}
   
