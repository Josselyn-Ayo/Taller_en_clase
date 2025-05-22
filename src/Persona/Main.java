package Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Estudiante
        System.out.println("Datos del Estudiante");
        System.out.println("Cedula: "); String cedulaE = sc.nextLine();
        System.out.println("Nombre: "); String nombreE = sc.nextLine();
        System.out.println("Direccion: "); String direccionE = sc.nextLine();
        System.out.println("Correo: "); String correoE = sc.nextLine();
        System.out.println("Telefono: "); String telefonoE = sc.nextLine();
        System.out.println("Carrera: "); String carreraE = sc.nextLine();
        System.out.println("Nivel: "); String nivelE = sc.nextLine();
        System.out.println("Año de nacimiento: "); int anioNacimientoE = sc.nextInt();sc.nextLine();
        Estudiante estudiante = new Estudiante(cedulaE, nombreE, direccionE, correoE, telefonoE, carreraE, nivelE, anioNacimientoE);
        estudiante.MostrarInformacionPersonal();
        System.out.println("--------------------------------------------");
        //Docente
        System.out.println("Datos del Docente");
        System.out.println("Cedula: "); String cedulaD = sc.nextLine();
        System.out.println("Nombre: "); String nombreD= sc.nextLine();
        System.out.println("Direccion: "); String direccionD = sc.nextLine();
        System.out.println("Correo: "); String correoD = sc.nextLine();
        System.out.println("Telefono: "); String telefonoD = sc.nextLine();
        System.out.println("facultad que pertenece : "); String facultadPerteneceD  = sc.nextLine();
        System.out.println("Horas asignadas: "); int horasAsignadasD = sc.nextInt(); sc.nextLine();
        Docente docente = new Docente(cedulaD, nombreD, direccionD,correoD, telefonoD,facultadPerteneceD, horasAsignadasD);
        docente.MostrarInformacionPersonal();
        System.out.println("--------------------------------------------");
        //Estudiante presencial
        System.out.println("Datos del Estudiante Presencial");
        System.out.println("Cedula: "); String cedulaEP = sc.nextLine();
        System.out.println("Nombre: "); String nombreEP = sc.nextLine();
        System.out.println("Direccion: "); String direccionEP = sc.nextLine();
        System.out.println("Correo: "); String correoEP = sc.nextLine();
        System.out.println("Telefono: "); String telefonoEP = sc.nextLine();
        System.out.println("Carrera: "); String carreraEP = sc.nextLine();
        System.out.println("Nivel: "); String nivelEP = sc.nextLine();
        System.out.println("Año de nacimiento: "); int anioNacimientoEP = sc.nextInt();sc.nextLine();
        System.out.println("Hora presencial: "); int hora_presencialEP = sc.nextInt();sc.nextLine();
        System.out.println("Horario: "); String horarioEP = sc.nextLine();
        EstudiantePresencial estudiantePresencial = new EstudiantePresencial(cedulaEP, nombreEP, direccionEP,correoEP, telefonoEP,carreraEP,
                nivelEP,anioNacimientoEP, hora_presencialEP, horarioEP);
        estudiantePresencial.MostrarInformacionPersonal();
        System.out.println("--------------------------------------------");
        System.out.println("Datos del Estudiante Virtual");
        System.out.println("Cedula: "); String cedulaEV = sc.nextLine();
        System.out.println("Nombre: "); String nombreEV = sc.nextLine();
        System.out.println("Direccion: "); String direccionEV = sc.nextLine();
        System.out.println("Correo: "); String correoEV = sc.nextLine();
        System.out.println("Telefono: "); String telefonoEV = sc.nextLine();
        System.out.println("Carrera: "); String carreraEV = sc.nextLine();
        System.out.println("Nivel: "); String nivelEV = sc.nextLine();
        System.out.println("Año de nacimiento: "); int anioNacimientoEV = sc.nextInt();sc.nextLine();
        System.out.println("Plataforma: "); String plataformaEV = sc.nextLine();
        System.out.println("Tutor Virtual: "); String tutorVirtual = sc.nextLine();
        EstudianteVirtual estudianteVirtual = new EstudianteVirtual(cedulaEV,nombreEV,direccionEV,correoEV,telefonoEV,carreraEV,nivelEV,
                anioNacimientoEV,plataformaEV,tutorVirtual);
        estudianteVirtual.MostrarInformacionPersonal();
        System.out.println("--------------------------------------------");
        //Docente en Linea
        System.out.println("Datos del Docente");
        System.out.println("Cedula: "); String cedulaDL = sc.nextLine();
        System.out.println("Nombre: "); String nombreDL= sc.nextLine();
        System.out.println("Direccion: "); String direccionDL = sc.nextLine();
        System.out.println("Correo: "); String correoDL = sc.nextLine();
        System.out.println("facultad que pertenece : "); String facultadPerteneceDL  = sc.nextLine();
        System.out.println("Horas asignadas: "); int horasAsignadasDL = sc.nextInt(); sc.nextLine();
        System.out.println("Tipo de contrato: "); String tipoContratoDL = sc.nextLine();
        DocenteLinea docenteLinea = new DocenteLinea(cedulaDL,nombreDL,direccionDL,correoDL,facultadPerteneceDL, horasAsignadasDL,
                tipoContratoDL);
        docenteLinea.MostrarInformacionPersonal();
        System.out.println("------------------------------------------------");
    }
}



