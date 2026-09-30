public class Escenas {
    public static void pausar (int segundos){
        try {
            Thread.sleep(segundos *1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    //ESCENA DEL DESPERTAR DEL PROTAGONISTA
    public static void inicarEscenaDespertar(){
        System.out.println("==INICIO DE LA AVENTURA==");
        pausar(4);
        System.out.println("En una nave en medio de la galaxia se encuentra koko, explorando de planeta en planeta en busca de un propósito");
        pausar(6);
        System.out.println("Pero algo extraño empezó a suceder con la nave...");
        pausar(4);
        System.out.println("//Suenan crujidos en el metal");
        pausar(4);
        System.out.println("//Luces rojas en modo de advertencia parpadean");
        pausar(4);
        System.out.println("Koko:¡No puede ser, debí revisar el estado de la nave antes del ultimo despegue!");
        pausar(4);
        System.out.println("Koko: ¡Rok, busca un lugar para el impacto yaa! ");
        pausar(6);
        System.out.println("Rok(IA de la nave): REDIRECCIONANDO IMPACTO AL PLANETA MAS CERCANO");
        pausar(4);
        System.out.println("Rok(IA de la nave): SE RECOMIENDA PREPARSE PARA EL IMPACTO");
        pausar(6);
        System.out.println("Koko: No puede ser, ese planeta...");
        pausar(4);
        System.out.println("Koko: tiene una niebla radioactiva....");
        pausar(4);
        System.out.println("Koko: ¡Roook despliega el traje de exploración ahora!");
        pausar(6);
        System.out.println("Rok(IA de la nave):TRAJE DESPLEGADO EN LA PUERTA TRASERA");
        pausar(4);
        System.out.println("Koko: ¡Rok inicia la cuenta regresiva antes del impacto!");
        pausar(4);
        System.out.println("//Koko se dirige rapidamente a la puerta trasera a colocarse el traje");
        pausar(4);
        System.out.println("//La nave esta cada vez mas cerca del impacto....");
        pausar(5);
        System.out.println("Rok(IA de la nave): IMPACTO EN 6..");
        pausar(1);
        System.out.println("Rok(IA de la nave): IMPACTO EN 5..");
        pausar(1);
        System.out.println("Rok(IA de la nave): IMPACTO EN 4..");
        pausar(1);
        System.out.println("Rok(IA de la nave): IMPACTO EN 3..");
        pausar(1);
        System.out.println("Rok(IA de la nave): IMPACTO EN 2..");
        pausar(1);
        System.out.println("Rok(IA de la nave): IMPACTO EN 1..");
        pausar(2);
        System.out.println("!BOOOOOM! El estruendo ensordecedor del impacto sacude todo el chasis de la nave...");
        pausar(4);
        System.out.println("Las chispas saltan por los paneles de control destruidos y la oscuridad lo envuelve todo...");
        pausar(5);
        System.out.println("...");
        pausar(3);
        System.out.println("...");
        pausar(4);
        System.out.println("//Un profundo silencio invade el lugar, solo interrumpido por el goteo de un líquido desconocido");
        pausar(5);
        System.out.println("Koko: (Tos ligera) Ugh... ¿Hola? ¿Rok, sigues ahí...?");
        pausar(4);
        System.out.println("Rok(IA de la nave): Sistemas al... 12%. Batería de emergencia activa. Signos vitales del piloto estables");
        pausar(7);
        System.out.println("//Koko abre los ojos con dificultad. A través del visor agrietado del traje ve una neblina densa allá afuera");
        pausar(6);
        System.out.println("Koko: El casco indica que el aire exterior es letal... pero el ventilador del traje absorbió algo del entorno");
        pausar(6);
        System.out.println("//Una extraña corriente de energía estática empieza a hormiguear en las palmas de las manos de Koko");
        pausar(6);
        System.out.println("Rok(IA de la nave): ¡Alerta!. El núcleo de radiación del planeta está interactuando con tu traje de exploración");
        pausar(6);
        System.out.println("Rok(IA de la nave): Has desbloqueado una anomalía genética: [ Chispa Inicial ]");
        pausar(5);
        System.out.println("...");
        pausar(3);
        System.out.println("...");
        System.out.println("==== Stray Spark====");
        pausar(2);
        System.out.println("==== Planeta Caelum Prime ====");
        pausar(3);
        System.out.println("Te has adentrado en el peligroso planeta. ¡Es hora de sobrevivir y descubrir qué misterios te aguardan!");
    }
}
