
import Calculadora.Calculadora;
import java.util.Scanner;

/**
 *
 * @author Jony Chiroy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcion = 0;
        double num1 = 0;
        double num2 = 0;

        do {
            System.out.println("\n\n------ Bienvenido! -------");
            System.out.println("Ingresa el número de la opción que deseas: ");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            opcion = scanner.nextInt();
            
            if (opcion==5) {
                System.exit(0);
            }

            System.out.println("Ingrese el primer número: ");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número: ");
            num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + calculadora.sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: ");
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es: ");
                    break;
                case 4:
                    System.out.println("El resultado de la division es: ");
                    break;
            }

        } while (opcion != 5);

    }

}
