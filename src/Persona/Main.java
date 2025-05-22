package Persona;

public class Main {
    public static void main(String[] args){

        Estudiante estudiante = new Estudiante("1727719039", "Anabel", "Panzaleo", "josselyn@gmail.com", "0989205590",
                "Tercologia de desarrollo de  Software","tercero",2005);
        estudiante.MostrarInformacionPersonal();
        System.out.println("----------------------------");
        Docente docente = new Docente("17275562223","Yadira", "Sangolqui","yadira@gmail.com","09999999999",
                "Esfot", 12);
        docente.MostrarInformacionPersonal();
        System.out.println("----------------------------");
        EstudiantePresencial estudianteP = new EstudiantePresencial("172505233","Alan","Simon Bolivar",
                "Alan@gmial.com","0999999999","Software","Tercero",2005, "Matutino",12);

        estudianteP.MostrarInformacionPersonal();
        System.out.println("----------------------------");
        EstudianteVirtual estudianteV = new EstudianteVirtual("151121312","Antony","Toledo", "Antony@gmail.com","09999999", "Software",
                "tercer", 2005, "Zoom","Yadira");
        estudianteV.MostrarInformacionPersonal();

    }
}
