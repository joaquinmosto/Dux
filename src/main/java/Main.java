import java.util.*;

public class Main {



    public static void main(String[] args) {
        Torneo torneo = new Torneo();
        Scanner scanner = new Scanner(System.in);
        torneo.torneo();
        while (true){
            System.out.println(" QUIERES JUGAR LA REVANCHA? (SI/NO) ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                break;

            }else{
                torneo.torneo();
            }
        }

    }
}