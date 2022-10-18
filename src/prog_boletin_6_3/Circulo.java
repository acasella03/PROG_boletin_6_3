package prog_boletin_6_3;

public class Circulo {

    private double radio;
    private final static double PI = 3.14;

    public Circulo() {

    }

    public Circulo(double radio, double PI) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getPI() {
        return PI;
    }

    public double calcularArea() {
        double area = PI*Math.pow(radio,2);
        return area;
    }
    
    public double calcularLongitud(){
        double longitud=2*PI*radio;
        return longitud;
    }
}
