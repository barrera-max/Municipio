import java.text.DecimalFormat;

public class Remis extends Auto {
    private String licencia;
    private int agencia;

    public Remis(String patente, String marca, int modelo, String licencia, int agencia) {
        super(patente, marca, modelo);
        this.licencia = licencia;
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0#");
        return "Remis{" +
                "licencia='" + licencia + '\'' +
                ", agencia=" + agencia +
                ", impuestos=" + df.format(calcularImpuestos()) +
                "\n\t" + super.toString() +
                '}';
    }

    @Override
    public double calcularImpuestos() {
        return (double) super.calcularImpuestos() * 1.10;
    }

    public int getAgencia(){
        return agencia;
    }
}