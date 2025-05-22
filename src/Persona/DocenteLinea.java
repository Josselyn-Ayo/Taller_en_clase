package Persona;

public class DocenteLinea extends Docente{
    public String tipoContrato;

    public DocenteLinea(String cedula, String nombre, String direccion, String correo, String facultadPertenece,
                        int horasAsignadas, String tipoContrato){
        super(cedula,nombre,direccion,correo,"Sin telefono",facultadPertenece,horasAsignadas);
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.facultadPertenece = facultadPertenece;
        this.horasAsignadas = horasAsignadas;
        this.tipoContrato = tipoContrato;

    }

    @Override
    public void MostrarInformacionPersonal() {
        super.MostrarInformacionPersonal();
        System.out.println("Tipo de contrato: ");
    }
}
