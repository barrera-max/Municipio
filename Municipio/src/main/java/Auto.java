import java.text.DecimalFormat;
import java.util.Calendar;

public class Auto {
    private String patente;
    private String marca;
    private int modelo;

    public Auto(String patente, String marca, int modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0#");
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", impuestos=" + df.format(calcularImpuestos())+
                '}';
    }

    public int getAntiguedad()
    {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - modelo;
    }

    public double calcularImpuestos() {
        if (getAntiguedad() < 10)
            return 200;
        else
        if (getAntiguedad()<=20)
            return 150;
        else
            return 0;
    }

    public int getModelo() {
        return modelo;
    }
}