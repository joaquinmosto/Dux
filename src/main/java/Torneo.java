import java.util.*;


public class Torneo {
    public Torneo() {
    }

    Scanner scanner = new Scanner(System.in);
    Player player1 = new Player();
    Player player2= new Player();
    Partidos partidos = new Partidos();

    public void torneo(){
        System.out.println("INGRESA EL NOMBRE DEL TORNEO: ");
        partidos.setNombre(scanner.nextLine());


        System.out.print("INGRESA EL NOMBRE DEL PRIMER JUGADOR: ");
        player1.setNombre(scanner.nextLine());
        System.out.println(player1.getNombre());




        System.out.print("INGRESA EL NOMBRE DEL SEGUNDO JUGADOR: ");
        player2.setNombre(scanner.nextLine());
        System.out.println(player2.getNombre());



        System.out.print("INGRESE PROBABILIDADES DE GANAR DE PRIMER JUGADOR: ");
        player1.setProbabilidad(scanner.nextDouble() / 100);
        System.out.println("EL JUGADOR 1 TENDRA %" + player1.getProbabilidad() * 100 + " DE GANAR");


        while (true) {
            System.out.print("INGRESE CANTIDAD DE SETS 3/5: ");
            partidos.setCantidadSet(scanner.nextInt());
            if (partidos.getCantidadSet() == 3 || partidos.getCantidadSet() == 5) {
                break;
            } else {
                System.out.println("SOLAMENTE PUEDEN SER 3 O 5 SETS");

            }

        }
        System.out.println("ESTA POR COMENZAR EL PARTIDO");

        partidos.partido(player1, player2);
        System.out.println("FIN DEL TORNEO " + partidos.getNombre());
    }



}

