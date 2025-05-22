package Persona;

public class EstudianteVirtual extends Estudiante{
    public String plataforma;
    public String tutor_Virtual;

    public EstudianteVirtual(String cedula, String nombre,String direccion, String correo, String telefono,
                             String carrera, String nivel, int anioNacimiento, String plataforma, String tutor_Virtual){
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel, anioNacimiento);
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.carrera = carrera;
        this.nivel = nivel;
        this.plataforma = plataforma;
        this.tutor_Virtual = tutor_Virtual;
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public void MostrarInformacionPersonal() {
        super.MostrarInformacionPersonal();
        System.out.println("Plataforma: "+ plataforma);
        System.out.println(" Tutor Virtual: " + tutor_Virtual);
    }
}
