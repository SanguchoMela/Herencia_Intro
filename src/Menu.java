import java.security.spec.RSAOtherPrimeInfo;

public class Menu {
    public static void main(String[] args) {
        //Para probar
        /*
        Persona miPersona = new Persona(1753650389,"Melany","Sangucho","Auqui de Monjas", 2605699);
        Persona Pedro = new Persona();

        System.out.println(miPersona.getCI());
        System.out.println(Pedro.getCI());
        //-------------------------------------------------------

        Estudiante Mayerli = new Estudiante(1759861359,"Mayerli","Catani","La Floresta",2685484,
                //atributos propios de estudiante
                2021321,"mayerli.catani@epn.edu.ec",3,"TSDS");

        Estudiante David = new Estudiante();

        System.out.println("Nombre: "+Mayerli.getNombre());
        Mayerli.caminar();
        Mayerli.estudiar();
        Mayerli.trabajar();
        Mayerli.leer();
        Mayerli.memorizar();

        David.setNombre("David");
        System.out.println("Nombre: "+David.getNombre());
        David.caminar();
        David.estudiar();
        David.trabajar();
        David.leer();
        David.memorizar();
        */
        //-------------------------------------------------------

        Doctor Ana = new Doctor();
        Ana.setOcupacion("Doctora");
        Ana.setEdad(33);
        Ana.setSigno("Leo");
        System.out.println("Ana es "+Ana.getOcupacion());
        System.out.println("Tiene "+Ana.getEdad()+" años");
        System.out.println("Es de signo"+Ana.getSigno());
        Ana.examinar();
        System.out.println();

        EmpleadoPublico Pablo = new EmpleadoPublico();
        Pablo.setOcupacion("Empleado Publico");
        Pablo.setTelefono(123456);
        System.out.println("Pablo es "+Pablo.getOcupacion());
        System.out.println("Su telefono es "+Pablo.getTelefono());
        Pablo.tramitar();
        System.out.println();

        Futbolista Maritza = new Futbolista();
        Maritza.setOcupacion("Futbolista");
        Maritza.setHorasEntreno(5);
        System.out.println("Maritza es "+Maritza.getOcupacion());
        System.out.println("Entrena "+Maritza.getHorasEntreno()+" horas al día");
        Maritza.correr();
        System.out.println();

        Estudiante Melani = new Estudiante();
        Melani.setOcupacion("Estudiante");
        Melani.setSemestre(3);
        System.out.println("Melani es "+Melani.getOcupacion());
        System.out.println("Esta en "+Melani.getSemestre()+"semestre");
        Melani.leer();


    }
}
