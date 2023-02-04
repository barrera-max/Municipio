public class Taxi extends Auto {
    private String licencia;

    public Taxi(String patente, String marca, int modelo, String licencia) {
        super(patente, marca, modelo);
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "licencia='" + licencia + '\'' +
                ", impuestos=" + calcularImpuestos() +
                "\n\t" + super.toString() +
                '}';
    }

    @Override
    public double calcularImpuestos() {
        return super.calcularImpuestos() + 150;
    }
}