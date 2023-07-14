import java.util.Random;
import java.util.Scanner;

public class Partidos {
    Scanner scanner = new Scanner(System.in);
    private String nombre;
    private int cantidadSet;

    public Partidos(String nombre, int cantidadSet) {
        this.nombre = nombre;
        this.cantidadSet = cantidadSet;
    }

    public Partidos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSet() {
        return cantidadSet;
    }

    public void setCantidadSet(int cantidadSet) {
        this.cantidadSet = cantidadSet;
    }


    public boolean puntos(Player player1){

        Random random = new Random();
        int numeroRandom;
        if (random.nextDouble() < player1.getProbabilidad()) {
            numeroRandom = random.nextInt(51) * 2;
            return true;
        }else {
            numeroRandom=random.nextInt(51) * 2 + 1;
            return false;
        }



    }
    public void set(Player player1, Player player2){
        player1.setPuntosSet(0);
        player2.setPuntosSet(0);
        while (player1.getPuntosSet() != 3 && player2.getPuntosSet() != 3) {

            if (puntos(player1) == true) {
                int[] array = {15, 30, 40};
                int valorViejo = player1.getPuntosSet();
                System.out.println(" JUGADOR1 : " + array[valorViejo]);
                int valorActual = valorViejo +1;
                player1.setPuntosSet(valorActual);

            } else {
                int[] array = {15, 30, 40};
                int valorViejo = player2.getPuntosSet();
                System.out.println(" JUGADOR2 : " + array[valorViejo]);
                int valorActual = valorViejo +1;
                player2.setPuntosSet(valorActual);
            }
        }
        if(player1.getPuntosSet() == 3){
            int valor1 = player1.getSets();
            int valor2 = valor1 +1;
            player1.setSets(valor2);
            System.out.println(" GANO UN SET JUGADOR1 ");

        }else {
            int valor1 = player1.getSets();
            int valor2 = valor1 +1;
            player2.setSets(valor2);
            System.out.println(" GANO UN SET JUGADOR2 ");

        }

    }
    public boolean partido(Player player1, Player player2){
        while (player1.getSets() != cantidadSet && player2.getSets() != cantidadSet){
            set(player1, player2);

        }
        if (player1.getSets() == cantidadSet) {
            System.out.println(" LO A GANADO EL JUGADOR1 " + player2.getSets() + " A " + player1.getSets());
            return true;

        }else{
            System.out.println(" GANO EL JUGADOR2 " + player1.getSets() + " A " + player2.getSets());
            return false;
        }


    }


}
