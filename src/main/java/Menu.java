import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void manejoMenu() {
        int opcionIngresada = 0;

        do {
            opcionIngresada = ingresarOpcionMenu();
        }while(opcionIngresada != 6);
    }

    public static void MostrarMenu() {
        System.out.println("""
                1) Ver datos.
                2) Remover decano.
                3) Remover oficina.
                4) Añadir decano.
                5) Añadir oficina.
                6) Definir oficina de rectoría
                7) Salir.
                """);
    }

    public static int ingresarOpcionMenu() {
        int opcionIngresada = 0;
        do {
            opcionIngresada = ingresarOpcion();
        }while(opcionIngresada < 1 || opcionIngresada > 6);

        return opcionIngresada;
    }

    public static int ingresarOpcion() {
        System.out.println("Por favor ingrese una opción.");

        try {
            return scanner.nextInt();
        }catch (NumberFormatException e) {
            System.out.println("Por favor ingrese una opción válida");
            return 0;
        }
    }
}
