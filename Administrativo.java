public class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, Fecha fechaNacimiento, String numEmpleado, Fecha fechaContratacion, double pago, double horasExtrasTrabajadas, String cargo) {
        super(nombre, fechaNacimiento, numEmpleado, fechaContratacion, horasExtrasTrabajadas, pago);
        this.cargo = cargo;
    }

    public Administrativo() {
        super();
        this.cargo = "";
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public double calcularPago() {
        //double pagoBase = super.calcularPago();
        //double pagoExtra = getHorasExtrasTrabajadas() * 255.0;
        //return super.pago + pagoExtra;
        double pagoBase = getPago();
        double horasExtras = getHorasExtrasTrabajadas() * 255.00;
        return pagoBase + horasExtras;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Cargo: " + getCargo());
    }
}