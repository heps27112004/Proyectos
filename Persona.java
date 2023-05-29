public class Persona {
    private String nombre;
    private Fecha fechaNacimiento;

    public Persona() {
        this.nombre = "";
        this.fechaNacimiento = new Fecha();
    }

    public Persona(String nombre, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  /*   public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }*/

    public void setDiaN(int dia){
        fechaNacimiento.setDia(dia);
    }

    public void setMesN(int mes){
        fechaNacimiento.setMes(mes);
    }

    public void setAnioN(int anio){
        fechaNacimiento.setAnio(anio);
    }

    public Fecha getFecha(){
        return fechaNacimiento;
    }



    public void imprimirDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento.toString());
    }
}