public class EmpleadoPublico extends Persona{
    private String puesto;
    private String cargo;
    private int codigo;

    public EmpleadoPublico(){
        super();
    }

    public EmpleadoPublico(int CI, String nombre, String apellido, String direccion, int telefono, int edad, String signo, String ocupacion, String puesto, String cargo, int codigo) {
        super(CI, nombre, apellido, direccion, telefono, edad, signo, ocupacion);
        this.puesto = puesto;
        this.cargo = cargo;
        this.codigo = codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void tramitar(){
        System.out.println("Este es el metodo tramitar");
    }
}
