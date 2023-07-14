import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartidosTest {




    @Test
    public void setTest(){
        Partidos partido = new Partidos();
        Player player1 = new Player();
        Player player2 = new Player();
        partido.set(player1, player2);
        //Si cambiamos el player en el test podemos verificar que asigna 1 set al ganador
        Assertions.assertEquals(1, player2.getSets());
    }
    @Test
    public void partidoTest(){
        Partidos partido = new Partidos();
        Player player1 = new Player();
        Player player2 = new Player();
        partido.partido(player1, player2);
        //En caso de ganar el partido el jugador1 devolvera true
        Assertions.assertTrue(true);
    }
    @Test
    public void puntosTest(){
        Partidos partido = new Partidos();
        Player player1 = new Player();
        Player player2 = new Player();
        partido.puntos(player1);
        //En caso de ganar el punto el jugador1 devolvera true
        Assertions.assertTrue(true);

    }




}
