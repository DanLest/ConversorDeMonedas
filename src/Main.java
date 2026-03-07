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

                Consulta consulta = new Consulta();
                Moneda moneda;
                double cantidad;
                double resultado;

                switch (opcion) {
                    case 1:
                        System.out.println("Has elegido Dólar a Peso Mexicano");
                        System.out.println("Por favor, ingresa la cantidad de dólares que deseas convertir:");
                        cantidad = lectura.nextDouble();
                        moneda = consulta.buscarMoneda("USD", "MXN");
                        resultado = cantidad * moneda.conversion_rate();
                        System.out.println("El valor de " + cantidad + " [USD] equivale a " + resultado + " [MXN]");
                        break;

                    case 2:
                        System.out.println("Has elegido Peso Mexicano a Dólar");
                        System.out.println("Por favor, ingresa la cantidad de Pesos Mexicanos que deseas convertir:");
                        cantidad = lectura.nextDouble();
                        moneda = consulta.buscarMoneda("MXN", "USD");
                        resultado = cantidad * moneda.conversion_rate();
                        System.out.println("El valor de " + cantidad + " [MXN] equivale a " + resultado + " [USD]");
                        break;

                    case 3:
                        System.out.println("Has elegido Dólar a Real Brasileño");
                        System.out.println("Por favor, ingresa la cantidad de Dolares que deseas convertir:");
                        cantidad = lectura.nextDouble();
                        moneda = consulta.buscarMoneda("USD", "BRL");
                        resultado = cantidad * moneda.conversion_rate();
                        System.out.println("El valor de " + cantidad + " [USD] equivale a " + resultado + " [BRL]");
                        break;

                    case 4:
                        System.out.println("Has elegido Real Brasileño a Dólar");
                        System.out.println("Por favor, ingresa la cantidad de Real Brasileños que deseas convertir:");
                        cantidad = lectura.nextDouble();
                        moneda = consulta.buscarMoneda("BRL", "USD");
                        resultado = cantidad * moneda.conversion_rate();
                        System.out.println("El valor de " + cantidad + " [BRL] equivale a " + resultado + " [USD]");
                        break;

                    case 5:
                        System.out.println("Has elegido Dólar a Peso Colombiano");
                        System.out.println("Por favor, ingresa la cantidad de Dolares que deseas convertir:");
                        cantidad = lectura.nextDouble();
                        moneda = consulta.buscarMoneda("USD", "COP");
                        resultado = cantidad * moneda.conversion_rate();
                        System.out.println("El valor de " + cantidad + " [USD] equivale a " + resultado + " [COP]");
                        break;

                    case 6:
                        System.out.println("Has elegido Peso Colombiano a Dólar");
                        System.out.println("Por favor, ingresa la cantidad de pesos colombianos que deseas convertir:");
                        cantidad = lectura.nextDouble();
                        moneda = consulta.buscarMoneda("COP", "USD");
                        resultado = cantidad * moneda.conversion_rate();
                        System.out.println("El valor de " + cantidad + " [COP] equivale a " + resultado + " [USD]");

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