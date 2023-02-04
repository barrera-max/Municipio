public class Municipio {
    private Auto[] vehiculos;

    public Municipio() {
        vehiculos = new Auto[5];
        vehiculos[0] = new Auto("ABC123", "Honda", 2010);
        vehiculos[1] = new Taxi("AXF142", "Honda", 2016, "T654");
        vehiculos[2] = new Remis("ACV125", "Ford", 2020, "R445", 3);
        vehiculos[3] = new Remis("XZY567", "Fiat", 1990, "R655", 3);
        vehiculos[4] = new Remis("LMN522", "Fiat", 2015, "R78", 2);

    }

    public String toString(){
        final StringBuilder sb = new StringBuilder();
        for (Auto a: vehiculos){
            System.out.println(a);
        }
    return sb.toString();}

    public Auto buscarMayorImpuesto() {
        Auto may =null;
        for(Auto a: vehiculos) {
            if(may == null || a.calcularImpuestos() > may.calcularImpuestos())
                    may = a;
        }
        return may;
    }

    public String controlarTaxis(int minimo) {
        StringBuilder sb = new StringBuilder();
        for (Auto a : vehiculos) {
            if(a instanceof Taxi && a.getModelo() < minimo){
                sb.append("\n" + a);
            }
        }
        return sb.toString();
    }

    public String listarRemisesPorAgencia(int agencia) {
        StringBuilder sb = new StringBuilder();
        for (Auto a : vehiculos) {
            if(a instanceof Remis && ((Remis)a).getAgencia() == agencia){
                sb.append("\n" +a);
            }
        }
        return sb.toString();
    }
}
