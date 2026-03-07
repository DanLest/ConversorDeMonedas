import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;

        String menu = """
                ***********************************************
                Sea bienvenido/a al Conversor de Monedas
                
                1) Dólar =>> Peso mexicano
                2) Peso mexicano =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                9) Salir
                 Elija una opción válida:
                ***********************************************
                """;

        while (opcion != 7) {
            System.out.println(menu);

            if (lectura.hasNextInt()) {
                opcion = lectura.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has elegido Dólar a Peso Mexicano");
                        break;

                    case 2:
                        System.out.println("Has elegido Peso Mexicano a Dólar");
                        break;

                    case 3:
                        System.out.println("Has elegido Dólar a Real Brasileño");
                        break;

                    case 4:
                        System.out.println("Has elegido Real Brasileño a Dólar");
                        break;

                    case 5:
                        System.out.println("Has elegido Dólar a Peso Colombiano");
                        break;
                    case 6:
                        System.out.println("Has elegido Peso Colombiano a Dólar");

                    case 9:
                        System.out.println("Finalizando el programa. ¡Gracias por usarlo!");
                        break;
                    default:
                        System.out.println("Opción no válida, por favor intente de nuevo.");
                }
            } else {
                System.out.println("Error: Por favor, ingrese un número entero.");
                lectura.next();
            }
        }
    }
}