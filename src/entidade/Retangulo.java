package entidade;
import java.lang.Math;
public class Retangulo {
    
    public double largura;
    public double altura;
    
    public double areaRetangulo(){
        double area= largura*altura;
        return  area;
    }
    public double perimetroRetangulo(){
        double perimetro=(2*this.altura)+(2*this.largura);
        return perimetro;
    }
    public double diagonalRetangulo(){
        double diagonal=Math.sqrt((Math.pow(altura,2))+(Math.pow(this.largura,2)));
        return diagonal;
    }
}