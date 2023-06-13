public class Persona {
    private int CI;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int edad;
    private String signo;
    private String ocupacion;


    //contructor----------------------------------
    public Persona(){
    }
    public Persona(int CI, String nombre, String apellido, String direccion, int telefono, int edad, String signo, String ocupacion) {
        this.CI = CI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.signo = signo;
        this.ocupacion = ocupacion;
    }

    //setters y getters-----------------------------
    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    //metodos-----------------------------
    public void caminar(){
        System.out.println("Este es el metodo caminar que pertenece a Persona");
    }
    public void trabajar(){
        System.out.println("Este el el metodo trabajar que pertenece a Persona");
    }
}
