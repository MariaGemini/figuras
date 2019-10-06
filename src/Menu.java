import ar.com.ada.figuras.abst.Figura;
import ar.com.ada.figuras.subclass.Circulo;
import ar.com.ada.figuras.subclass.Rectangulo;
import ar.com.ada.figuras.subclass.Triangulo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<Figura> figuras = new ArrayList<Figura>();

    public static void menuPrincipal() {

        System.out.println("Elija la figura de la que quiere calcular el área");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Círculo");

        int figuraElegida = sc.nextInt();

        switch (figuraElegida) {
            case 1:
                System.out.print("Ingrese la base ");
                double b = sc.nextDouble();
                System.out.print("Ingrese la altura ");
                double h = sc.nextDouble();
                Triangulo triangulo1 = new Triangulo(b, h);
                figuras.add(triangulo1);
                triangulo1.calculaArea();
                System.out.println("La figura creada es " + '\n' + triangulo1.toString());
                break;
            case 2:
                System.out.print("Ingrese la base ");
                b = sc.nextDouble();
                System.out.print("Ingrese la altura ");
                h = sc.nextDouble();
                Rectangulo rectangulo1 = new Rectangulo(b, h);
                figuras.add(rectangulo1);
                rectangulo1.calculaArea();
                System.out.println("La figura creada es " + '\n' + rectangulo1.toString());
                break;
            case 3:
                System.out.print("Ingrese el radio ");
                b = sc.nextDouble();
                Circulo ciculo1 = new Circulo(b);
                figuras.add(ciculo1);
                ciculo1.calculaArea();
                System.out.println("La figura creada es " + '\n' + ciculo1.toString());
                break;

            default:
                System.out.println("No es una figura válida");
        }

        Menu.menu2();
    }

    public static void menu2() {
        System.out.println("Querés calcular el área de otra figura?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        int respuesta = sc.nextInt();

        if (respuesta == 1) {
            Menu.menuPrincipal();
        } else {

            Menu.mostrarFigura();
        }
    }

    public static void mostrarFigura() {
        System.out.println("Estas son todas las figuras que creaste: ");
        for (int i = 0; i < figuras.size(); i++) {
            System.out.println(figuras.get(i));

        }
    }

    public static void compararFiguras() {
        for (int i = 0; i < figuras.size(); i++) {
            for (int j = i + 1; j < figuras.size(); j++) {
                if (figuras.get(i).equals(figuras.get(j))) {
                    System.out.println("Estas figuras son iguales: \n " +   figuras.get(i) + "\n" + figuras.get(j));
                }

            }

        }

    }
}
