import java.util.Scanner;

public class Juego {
    public static void postDespertar() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        boolean juego = true;
        while (running) {
            System.out.println("Eliga una opción");
            System.out.println("1. Comenzar");
            System.out.println("2. Volver al menu principal");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                Escenas.postDespertar();
                while(juego){
                    System.out.println("¿Que deseas hacer?");
                    System.out.println("1. Acercarse al panel y probar");
                    System.out.println("2. Intentar abrir a la puerta a la fuerza");
                    System.out.println("3. Volver al menu principal");

                    input = scanner.nextLine();
                    if(input.equals("1")){
                        Escenas.abrirPuertaChispaInicial();
                        while(juego){
                            System.out.println("¿Que deseas hacer?");
                            System.out.println("1. Revisar el estado de la nave");
                            System.out.println("2. Salir de la nave");
                            System.out.println("3. Volver al menu principal");

                            input = scanner.nextLine();
                            if (input.equals("1")){
                                Escenas.revisarLaNave();
                            }else if(input.equals("2")){
                                Escenas.salirDeLaNave();
                            }else if (input.equals("3")){
                                System.out.println("Navegando al menu principal");
                                Escenas.pausita();
                                juego = false;
                                running = false;
                            }else{
                                System.out.println("Opción no válida");
                                Escenas.pausita();
                            }
                        }
                    }else if(input.equals("2")){
                        Escenas.abrirPuertaNave();
                    }else if(input.equals("3")){
                        System.out.println("Navegando al menu principal");
                        juego = false;
                        running = false;
                    }else{
                        System.out.println("Opción no válida");
                        Escenas.pausita();
                    }
                }
            }else if(input.equals("2")){
                System.out.println("Navegando al menu principal");
                Escenas.pausita();
                running = false;
            }else{
                System.out.println("Opción no válida");
                Escenas.pausita();
            }
        }
    }
}
