package Persona;
//Clase hija
public class Docente extends Persona {
    public String facultadPertenece;
    public int horasAsignadas;
    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, String facultadPertenece,
                   int horasAsignadas ){
        super(cedula, nombre, direccion, correo, telefono);
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.facultadPertenece = facultadPertenece;
        this.horasAsignadas = horasAsignadas;
    }

    @Override
    public void MostrarInformacionPersonal() {
        super.MostrarInformacionPersonal();
        System.out.println("Facultad que pertenece: "+ facultadPertenece);
        System.out.println("Horas Asignadas: "+ horasAsignadas);
    }
}
