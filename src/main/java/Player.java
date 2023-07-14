public class Player {

    private String nombre;
    private int puntosSet = 0;
    private double probabilidad;
    private int sets = 0;
    private boolean saque;

    public Player() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSaque() {
        return saque;
    }

    public void setSaque(boolean saque) {
        this.saque = saque;
    }

    public int getPuntosSet() {
        return puntosSet;
    }

    public void setPuntosSet(int puntosSet) {
        this.puntosSet = puntosSet;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public Player(String nombre, int puntosSet, double probabilidad, int sets, boolean saque) {
        this.nombre = nombre;
        this.puntosSet = puntosSet;
        this.probabilidad = probabilidad;
        this.sets = sets;
        this.saque = saque;
    }
}


