public abstract class Empleado extends Persona {
    protected String numEmpleado;
    protected Fecha fechaContratacion;
    protected double pago;
    protected double horasExtrasTrabajadas;

    public Empleado() {
        super("", new Fecha(1,1,2000));
        this.numEmpleado = "";
        this.fechaContratacion = new Fecha(1,1,2000);
        this.horasExtrasTrabajadas = 0;
        this.pago=0;
    }

    public Empleado(String nombre, Fecha fechaNacimiento, String numEmpleado, Fecha fechaContratacion, double horasExtrasTrabajadas,double pago) {
        super(nombre, fechaNacimiento);
        this.numEmpleado = numEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
        this.pago=pago;
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public Fecha getFechaContratacion() {
        return fechaContratacion;
    }

    /*public void setFechaContratacion(Fecha fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }*/

    public void setDiaC(int dia){
        fechaContratacion.setDia(dia);
    }
    public void setMesC(int mes){
        fechaContratacion.setMes(mes);
    }

    public void setAnioC(int anio){
        fechaContratacion.setDia(anio);
    }

    public double getPago() {
        return pago;
    }

    public void setPago(int pago){
        this.pago=pago;
    }

    public double getHorasExtrasTrabajadas() {
        return horasExtrasTrabajadas;
    }

    public void setHorasExtrasTrabajadas(double horasExtrasTrabajadas) {
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
    }

    public abstract double calcularPago();

    public void imprimirDatos() {
        super.imprimirDatos();
        //System.out.println("Nombre: " + nombre);
        //System.out.println("Fecha de nacimiento: " + fechaNacimiento.toString());
        System.out.println("Número de empleado: " + numEmpleado);
        System.out.println("Fecha de contratación: " + fechaContratacion.toString());
        System.out.println("Pago: " + pago);
        System.out.println("Horas extras trabajadas: " + horasExtrasTrabajadas);
    }
}
