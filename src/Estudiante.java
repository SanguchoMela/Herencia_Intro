public class Estudiante extends Persona{
    private int codigo;
    private String correo;
    private int semestre;
    private String carrera;

    public Estudiante(){
        super();
    }

    public Estudiante(int CI, String nombre, String apellido, String direccion, int telefono, int edad, String signo, String ocupacion, int codigo, String correo, int semestre, String carrera) {
        super(CI, nombre, apellido, direccion, telefono, edad, signo, ocupacion);
        this.codigo = codigo;
        this.correo = correo;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void estudiar(){
        System.out.println("Este es el metodo estudiar que pertenece a Estudiante");
    }
    public void leer(){
        System.out.println("Este es el metodo leer");
    }
    public void memorizar(){
        System.out.println("Este es el metodo memorizar que pertenece a Estudiante");
    }
}
