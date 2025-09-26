public class DemoEj9 {
    public static void main(String[] args){
        Paciente p = new Paciente("Carlos Perez","OSDE");
        Profesional prof = new Profesional("Dra. Gómez","Cardiologia");
        CitaMedica cita = new CitaMedica("2025-10-10","09:30",p,prof);
        System.out.println(cita);
    }
}
