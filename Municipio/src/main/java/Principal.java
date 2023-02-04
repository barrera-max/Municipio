import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MUNICIPIO:");
        Municipio municipio = new Municipio();
        System.out.println("Listado de vehiculos");
        System.out.println(municipio);
        System.out.println("Vehiculo que paga mas impuestos: ");
        System.out.println(municipio.buscarMayorImpuesto());
        System.out.println("\nControl de taxis");
        System.out.println("Taxis que deberan renovar su vehiculo");
        System.out.println("Ingrese el modelo minimo: ");
        int minimo = sc.nextInt();
        System.out.println(municipio.controlarTaxis(minimo));
        System.out.println("\nRemises por agencia");
        System.out.println("Ingrese numero de agencia (0-9inclusive): ");
        int agencia = sc.nextInt();
        System.out.println(municipio.listarRemisesPorAgencia(agencia));
    }
}
