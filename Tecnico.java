public class Tecnico extends Empleado {
    private String turnoTrabajo;

    public Tecnico(String nombre, Fecha fechaNacimiento, String numEmpleado, Fecha fechaContratacion,
                   double pago, double horasExtrasTrabajadas, String turnoTrabajo) {
        super(nombre, fechaNacimiento, numEmpleado, fechaContratacion, pago, horasExtrasTrabajadas);
        this.turnoTrabajo = turnoTrabajo;
    }

    public Tecnico() {
        super();
        this.turnoTrabajo = "";
    }


    public String getTurnoTrabajo() {
        return turnoTrabajo;
    }

    public void setTurnoTrabajo(String turnoTrabajo) {
        this.turnoTrabajo = turnoTrabajo;
    }

    @Override
    public double calcularPago() {
        double pagoBase = getPago();
        double horasExtras = getHorasExtrasTrabajadas() * 150.00;
        return pagoBase + horasExtras;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Turno de trabajo: " + turnoTrabajo);
    }
}