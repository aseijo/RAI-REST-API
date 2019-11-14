package cilindro;


public class Cilindro {

    private double altura;
    private double radio;

    public Cilindro(double altura, double radio){
        this.altura = altura;
        this.radio = radio;
    }

    public double getArea(){
        return radio*2*Math.PI*altura+2*Math.PI*(radio*radio);
    }

    public double getVolumen(){
        return Math.PI*(radio*radio)*altura;
    }
}
