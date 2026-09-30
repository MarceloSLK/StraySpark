import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("====MENU ESTELAR====");
            System.out.println("1. Iniciar aventura");
            System.out.println("2. Cerrar juego");
            System.out.println("Eliga una opción: ");

            String input = scanner.nextLine();
            if (input.equals("2")) {
                running = false;
                System.out.println("Opción seleccionada: " + input);
                System.out.println("¡Vuelve pronto viajero!");
            } else{
                System.out.println("Opción seleccionada: " + input);
                Escenas.inicarEscenaDespertar();

            }
        }

        scanner.close();
    }
}