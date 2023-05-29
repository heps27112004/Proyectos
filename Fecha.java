public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }


    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //public partesFecha(String)

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void imprimirFecha() {
        System.out.println(dia + "/" + mes + "/" + anio);
    }


    /*public String getYear() {
        return anio;
    }*/


    public int compareTo(Fecha otraFecha) {
        if (this.anio < otraFecha.anio) {
            return -1;
        } else if (this.anio > otraFecha.anio) {
            return 1;
        } else {
            if (this.mes < otraFecha.mes) {
                return -1;
            } else if (this.mes > otraFecha.mes) {
                return 1;
            } else {
                if (this.dia < otraFecha.dia) {
                    return -1;
                } else if (this.dia > otraFecha.dia) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
