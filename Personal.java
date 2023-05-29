import java.util.ArrayList;
import java.util.Scanner;



public class Personal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("\nIngrese los datos de la persona:");
        Persona persona1 = new Persona();
        System.out.print("Nombre: ");
        persona1.setNombre(teclado.nextLine());
        //teclado.nextLine();
        System.out.println("Fecha de nacimiento (en formato dd/mm/aaaa): ");
        int dia = teclado.nextInt();
        int mes= teclado.nextInt();
        int anio=teclado.nextInt();
        persona1.setDiaN(dia);
        persona1.setMesN(mes);
        persona1.setAnioN(anio);


        ArrayList<Empleado>empleados=new ArrayList<>();

        System.out.println("Ingrese los datos del empleado administrativo:");
        Administrativo administrativo1 = new Administrativo();
        System.out.println("Nombre: ");
        administrativo1.setNombre(teclado.nextLine());
        teclado.nextLine();
        System.out.println("Fecha de nacimiento: ");
        administrativo1.setDiaN(teclado.nextInt());
        administrativo1.setMesN(teclado.nextInt());
        administrativo1.setAnioN(teclado.nextInt());
        teclado.nextLine(); // Consumir el salto de línea
        System.out.println("Número de empleado: ");
        administrativo1.setNumEmpleado(teclado.nextLine());
        //teclado.nextLine();
        System.out.println("Cargo: ");
        administrativo1.setCargo(teclado.nextLine());
        System.out.println("Fecha de Ingreso: ");
        administrativo1.setDiaC(teclado.nextInt());
        administrativo1.setMesC(teclado.nextInt());
        administrativo1.setAnioC(teclado.nextInt());
        System.out.println("Pago: ");
        administrativo1.setPago(teclado.nextInt());
        System.out.println("Horas extra trabajadas: ");
        administrativo1.setHorasExtrasTrabajadas(teclado.nextFloat());
        teclado.nextLine(); // Consumir el salto de línea
        empleados.add(administrativo1);
        teclado.hasNextLine();

        System.out.println("Ingrese los datos del empleado técnico:");
        Tecnico tecnico1 = new Tecnico();
        System.out.println("Nombre: ");
        tecnico1.setNombre(teclado.nextLine());
        teclado.nextLine();
        System.out.println("Fecha de Ingreso: ");
        tecnico1.setDiaC(teclado.nextInt());
        tecnico1.setMesC(teclado.nextInt());
        tecnico1.setAnioC(teclado.nextInt());
        teclado.nextLine(); // Consumir el salto de línea
        System.out.println("Número de empleado: ");
        tecnico1.setNumEmpleado(teclado.nextLine());
        System.out.println("Fecha de nacimiento: ");
        tecnico1.setDiaN(teclado.nextInt());
        tecnico1.setMesN(teclado.nextInt());
        tecnico1.setAnioN(teclado.nextInt());
        teclado.nextLine(); // Consumir el salto de línea
        System.out.println("Turno de trabajo: ");
        tecnico1.setTurnoTrabajo(teclado.nextLine());
        System.out.println("Sueldo: ");
        tecnico1.setPago(teclado.nextInt());
        System.out.println("Horas extra trabajadas: ");
        tecnico1.setHorasExtrasTrabajadas(teclado.nextFloat());
        teclado.nextLine(); // Consumir el salto de línea
        empleados.add(tecnico1);
        //System.out.print("Ingrese el número de empleados: ");
        //int n = teclado.nextInt();

        Empleado empleadoMasAntiguo = null;
        for (Empleado empleado : empleados) {
            if (empleadoMasAntiguo == null || empleado.getFechaContratacion().compareTo(empleadoMasAntiguo.getFechaContratacion()) < 0) {
                empleadoMasAntiguo = empleado;
            }
        }           

        if (empleadoMasAntiguo != null) {
            System.out.println("Empleado más antiguo:");
            empleadoMasAntiguo.imprimirDatos();
        }

        System.out.println("\nEmpleados con horas extra:");
        for (Object empleado : empleados) {
            if (empleado instanceof Empleado) {
                Empleado emp = (Empleado) empleado;
                if (emp.getHorasExtrasTrabajadas() > 0) {
                    System.out.println(emp.getNombre());
                }
            }
        }

        System.out.println("\nDatos de contratación:");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Número de empleado: " + empleado.getNumEmpleado());
            System.out.println("Fecha de Contratación: " + empleado.getFechaContratacion().toString());
            System.out.println(); // Agregar un salto de línea para separar los datos de cada empleado
        }
     }
}