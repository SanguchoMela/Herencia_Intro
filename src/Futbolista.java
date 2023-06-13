public class Futbolista extends Persona{
    private String equipo;
    private String posicion;
    private int dorsal;
    private String representante;
    private int horasEntreno;

    public Futbolista(){
        super();
    }

    public Futbolista(int CI, String nombre, String apellido, String direccion, int telefono, int edad, String signo, String ocupacion, String equipo, String posicion, int dorsal, String representante, int horasEntreno) {
        super(CI, nombre, apellido, direccion, telefono, edad, signo, ocupacion);
        this.equipo = equipo;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.representante = representante;
        this.horasEntreno = horasEntreno;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getHorasEntreno() {
        return horasEntreno;
    }

    public void setHorasEntreno(int horasEntreno) {
        this.horasEntreno = horasEntreno;
    }

    public void correr(){
        System.out.println("Este es el metodo correr");
    }
}
