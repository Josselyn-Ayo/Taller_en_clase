package Persona;

public class  Estudiante extends Persona {
    public String carrera;
    public String nivel;
    public int anioNacimiento;

    public Estudiante(String cedula, String nombre,String direccion, String correo, String telefono, String carrera, String nivel , int anioNacimiento){
        super(cedula,nombre, direccion,  correo,  telefono);
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.carrera = carrera;
        this.nivel = nivel;
        this.anioNacimiento = anioNacimiento;

    }
    public int CalcularEdad(int anioActual){
        return anioActual - anioNacimiento;

    }

    @Override
    public void MostrarInformacionPersonal() {

        super.MostrarInformacionPersonal();
        System.out.println("Carrera: "+ carrera);
        System.out.println("Nivel: "+ nivel);
        System.out.println(" Edad:" + CalcularEdad(2025 )+ "años");


    }
}
