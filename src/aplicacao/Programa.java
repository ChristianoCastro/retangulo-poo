package aplicacao;

import entidade.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Retangulo r1= new Retangulo();
        
        System.out.println("Informe a altura do retangulo: ");
        r1.altura=sc.nextDouble();
        
        System.out.println("Informe a largura do retangulo: ");
        r1.largura=sc.nextDouble();
        
        System.out.printf("Area: %.2f\n",r1.areaRetangulo());
        System.out.printf("Area: %.2f\n",r1.perimetroRetangulo());
        System.out.printf("Area: %.2f\n",r1.diagonalRetangulo());
        
        sc.close();
        
    }
    
}
