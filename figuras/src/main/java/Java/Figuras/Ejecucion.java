package Java.Figuras;
import java.util.Scanner;
public class Ejecucion 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int eleccion;

        Octogono octogono = new Octogono();
        Rectangulo rectangulo = new Rectangulo();
        Trapecio trapecio = new Trapecio();

        System.out.println("Menu Figuras");
        System.out.println("Seleccione la figura con la que desa calcular area y permitero: \n1.Octogono\n2.Rectangulo\n3.Trapecio");
        eleccion = scanner.nextInt();

        switch(eleccion)
        {
            case 1: 
            System.out.println("Ingrese la longitud de un lado del octogono");
            octogono.setLongitudP(scanner.nextDouble());
            octogono.calcularPerimetro();

            System.out.println("Ingrese el perimetro del octogono");
            octogono.setPerimetroA(scanner.nextDouble());
            System.out.println("Ingrese el apotema del octogono");
            octogono.setApotemaA(scanner.nextDouble());
            octogono.calcularArea();
            break;

            case 2:
            System.out.println("Ingrese la base ya sumada del rectangulo ");
            rectangulo.setBase(scanner.nextDouble());;
            System.out.println("Ingrese la altura ya sumada del rectangulo");
            rectangulo.setAltura(scanner.nextDouble());
            rectangulo.calcularPerimetro();

            System.out.println("Ingrese la base ya sumada del rectangulo ");
            rectangulo.setBase(scanner.nextDouble());;
            System.out.println("Ingrese la altura ya sumada del rectangulo");
            rectangulo.setAltura(scanner.nextDouble());
            rectangulo.calcularArea();
            break;

            case 3:
            System.out.println("Ingrese la base ya sumada del trapecio ");
            trapecio.setBase(scanner.nextDouble());
            System.out.println("Ingrese los laterales ya sumados del trapecio");
            trapecio.setLateral(scanner.nextDouble());
            trapecio.calcularPerimetro();

            System.out.println("Ingrese la base ya sumada del trapecio ");
            trapecio.setBase(scanner.nextDouble());
            System.out.println("Ingrese los laterales ya sumados del trapecio");
            trapecio.setLateral(scanner.nextDouble());
            trapecio.calcularArea();
            break;

            default : break;
        }
        scanner.close();
    }
}
