public class Interfaces implements operaciones { // implementación de la interfaz
    public static void main(String[] args) {
        // declaración de variables
        double x = 12.0;
        double y = 6.0;

        // impresión de los métodos
        System.out.println(new Interfaces().suma(x, y));
        System.out.println(new Interfaces().resta(x, y));
        System.out.println(new Interfaces().multiplicacion(x, y));
        System.out.println(new Interfaces().division(x, y));

    }

    // sobreescritura de métodos
    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }
}

// clase interfaz
interface operaciones {

    public double suma(double a, double b);

    public double resta(double a, double b);

    public double multiplicacion(double a, double b);

    public double division(double a, double b);

}