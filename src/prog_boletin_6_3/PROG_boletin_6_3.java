package prog_boletin_6_3;

public class PROG_boletin_6_3 {

        public static void main(String[] args) {
        Circulo obj1 = new Circulo();
        obj1.setRadio(5);
        obj1.calcularArea();
        obj1.calcularLongitud();
        System.out.println("El area es: "+obj1.calcularArea()+"\nLa longitud es: "+obj1.calcularLongitud());
    }
    
}
