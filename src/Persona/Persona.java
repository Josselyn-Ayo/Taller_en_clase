package Persona;
//Clase
public class Persona {
    public String cedula;
    public String nombre;
    public String direccion;
    public String correo;
    public String telefono;

    public Persona(String cedula, String nombre,String direccion, String correo, String telefono ){
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    public void MostrarInformacionPersonal(){
        System.out.println("Cedula: "+ cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Direccion: "+ direccion);
        System.out.println("Correo: "+ correo);
        System.out.println("Telefono: "+ telefono);

    }
}
