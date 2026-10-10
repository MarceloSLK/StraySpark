import java.util.Scanner;

public class Escenas {
    public static void pausar (int segundos){
        try {
            Thread.sleep(segundos *1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    //PAUSA DE 2 SEGUNDOS
    public static void pausita(){
        pausar(2);
    }

    //ESCENA DEL DESPERTAR DEL PROTAGONISTA
    public static void inicarEscenaDespertar(){
        System.out.println("==INICIO DE LA AVENTURA==");
        pausar(1);
        System.out.println("En una nave en medio de la galaxia se encuentra koko, explorando de planeta en planeta en busca de un propósito");
        pausar(1);
        System.out.println("Pero algo extraño empezó a suceder con la nave...");
        pausar(1);
        System.out.println("//Suenan crujidos en el metal");
        pausar(1);
        System.out.println("//Luces rojas en modo de advertencia parpadean");
        pausar(1);
        System.out.println("Koko:¡No puede ser, debí revisar el estado de la nave antes del ultimo despegue!");
        pausar(1);
        System.out.println("Koko: ¡Rok, busca un lugar para el impacto yaa! ");
        pausar(1);
        System.out.println("Rok(IA de la nave): REDIRECCIONANDO IMPACTO AL PLANETA MAS CERCANO");
        pausar(1);
        System.out.println("Rok(IA de la nave): SE RECOMIENDA PREPARSE PARA EL IMPACTO");
        pausar(1);
        System.out.println("Koko: No puede ser, ese planeta...");
        pausar(1);
        System.out.println("Koko: tiene una niebla radioactiva....");
        pausar(1);
        System.out.println("Koko: ¡Roook despliega el traje de exploración ahora!");
        pausar(1);
        System.out.println("Rok(IA de la nave):TRAJE DESPLEGADO EN LA PUERTA TRASERA");
        pausar(1);
        System.out.println("Koko: ¡Rok inicia la cuenta regresiva antes del impacto!");
        pausar(1);
        System.out.println("//Koko se dirige rapidamente a la puerta trasera a colocarse el traje");
        pausar(1);
        System.out.println("//La nave esta cada vez mas cerca del impacto....");
        pausar(1);
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
        pausar(1);
        System.out.println("!BOOOOOM! El estruendo ensordecedor del impacto sacude todo el chasis de la nave...");
        pausar(1);
        System.out.println("Las chispas saltan por los paneles de control destruidos y la oscuridad lo envuelve todo...");
        pausar(1);
        System.out.println("...");
        pausar(1);
        System.out.println("...");
        pausar(1);
        System.out.println("//Un profundo silencio invade el lugar, solo interrumpido por el goteo de un líquido desconocido");
        pausar(1);
        System.out.println("Koko: (Tos ligera) Ugh... ¿Hola? ¿Rok, sigues ahí...?");
        pausar(1);
        System.out.println("Rok(IA de la nave): Sistemas al... 12%. Batería de emergencia activa. signos vitales del piloto alterados");
        pausar(1);
        System.out.println("//Koko abre los ojos con dificultad. A través del visor agrietado del traje ve una neblina densa por la ventana de la nave");
        pausar(1);
        System.out.println("Koko: El casco indica que el aire exterior es letal... pero el ventilador del traje absorbió algo del entorno");
        pausar(1);
        System.out.println("//Una corriente de energía empieza a hormiguear en el cuerpo de Koko al estar apoyado en el tablero eléctrico");
        pausar(1);
        System.out.println("Rok(IA de la nave): ¡Alerta!. El núcleo de radiación del planeta está interactuando con tu traje de exploración");
        pausar(1);
        System.out.println("Rok(IA de la nave): Has desbloqueado una anomalía genética: [Chispa Inicial]");
        pausar(1);
        System.out.println("...");
        pausar(1);
        System.out.println("...");
        System.out.println("==== Stray Spark====");
        pausar(1);
        System.out.println("==== Planeta Caelum Prime ====");
        pausar(1);
        System.out.println("Te has adentrado en el peligroso planeta Caelum Prime. ¡Es hora de sobrevivir y descubrir qué misterios te aguardan!");
    }
    //ESCENA POST DESPERTAR
    public static void postDespertar(){
            pausar(4);
            System.out.println("Koko intenta ponerse de pie, sintiendo cómo esa extraña energía estática recorre los músculos de sus brazos");
            pausar(5);
            System.out.println("Koko: Ugh... mi cuerpo se siente diferente, como si llevara electricidad pura en las venas");
            pausar(4);
            System.out.println("//Koko camina tambaleándose hacia la compuerta trasera de la nave y presiona el botón de emergencia");
            pausar(4);
            System.out.println("//Al presionar el botón se escuchan chispas en toda la nave... pero la puerta no se abre");
            pausar(4);
            System.out.println("Koko: ¡Mierda! El sistema principal está muerto y la puerta quedó bloqueada");
            pausar(4);
            System.out.println("Koko:¡Rok! ¿Que sucede con la puerta?");
            pausar(2);
            System.out.println("Rok(IA de la nave): Analizando estado de la compuerta... Bloqueo mecánico por falta de energía");
            pausar(5);
            System.out.println("Rok(IA de la nave): Koko, los sensores indican que la energía de tu cuerpo se canaliza en las palmas de tus manos");
            pausar(6);
            System.out.println("Rok(IA de la nave): Te sugiero acércate al panel de circuitos expuesto de la puerta y canalizar esa energía para forzar el mecanismo");
            pausar(4);
            System.out.println("Koko: Mmmm, que extraña sensación intentare abrir...");
            pausar(3);
    }
    //ESCENA ABRIR PUERTO CON EL PODER CHISPA INICIAL
    public static void abrirPuertaChispaInicial(){
        System.out.println("//Koko se acerca a la puerta...");
        pausar(2);
        System.out.println("Koko: Bien... aquí voy..");
        pausar(2);
        System.out.println("//Koko se concentra con la mano frente al panel");
        pausar(2);
        System.out.println("Rok(IA de la nave): Los sensores indican que hay una gran cantidad de energía en tu mano Koko");
        pausar(2);
        System.out.println("Rok(IA de la nave): Prueba acercando tu mano lentamente");
        pausar(2);
        System.out.println("Koko: Entiendo... bien Koko ve lentamente... un poco más....");
        pausar(3);
        System.out.println("Bzzzt!!, El tablero recibe la descarga y la compuerta se abre bruscamente");
        pausar(3);
        System.out.println("Koko: ¡Wow, Viste eso Rok!");
        pausar(2);
        System.out.println("Rok(IA de la nave): ¡Felicidades!, me transferiré al caso de tu traje por si deseas salir a explorar");
        pausar(2);
        System.out.println("...");
        pausar(2);
        System.out.println("Rok(IA de la nave): Hola Koko, ya estoy en el caso del traje, ¿que dices... salimos a explorar y buscar repuestos para la nave?");
        pausar(4);
        System.out.println("Koko: Bienvenido Rok, dejame pensar que haremos");

    }
    //ESCENA INTENTAR ABRIR PUERTA DE LA NAVE
    public static void abrirPuertaNave(){
        System.out.println("//Koko se acerca a la puerta y emplea toda su fuerza para abirla");
        pausar(3);
        System.out.println("Koko: AGH... no puedo abrirla, es muy pesada y no tengo fuerzas");
        pausar(2);
        System.out.println("Debería intentar con la idea de Rok");
    }

    //ESCENA REVISAR LA NAVE
    public static void revisarLaNave(){
        System.out.println("OHH TA TO MAL AKI, MEJOR SALGO MI LIDEL");
        //el pj avanzara un poco y hablara de algo de la nave, el jugador debe idnicar si seguir viendo la nave o salir de la nave
    }

    //ESCENA SALIR DE LA NAVE
    public static void salirDeLaNave(){
        System.out.println("Naa pero y ete planeta ta pal ñato siono rok");

        //Indicar 2 caminos a elegir(el pj termina explorando los 2 caminos)
    }

}
