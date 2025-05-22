package Persona;

public class EstudiantePresencial extends Estudiante {
    public int hora_presencial;
    public String horario;

    public EstudiantePresencial(String cedula, String nombre,String direccion, String correo, String telefono,
                                String carrera, String nivel,int anioNacimiento, int hora_presencial, String horario){
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel, anioNacimiento);
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.carrera = carrera;
        this.nivel = nivel;
        this.anioNacimiento = anioNacimiento;
        this.hora_presencial = hora_presencial;
        this.horario = horario;
    }

    @Override
    public void MostrarInformacionPersonal() {
        super.MostrarInformacionPersonal();
        System.out.println("Horas presenciales: " + hora_presencial);
        System.out.println("Horario: "+ horario);
    }
}
