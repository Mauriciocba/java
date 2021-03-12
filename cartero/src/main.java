
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la cantidad de piezas a cargar");
        int cantidadPiezas = sc.nextInt();

        correo c = new correo(cantidadPiezas);
        for (int i = 0; i < cantidadPiezas; i++) {
            piezas p = new piezas();
            System.out.println("ingrese numero de pieza");
            p.setNroPieza(sc.nextInt());
            System.out.println("ingrese el tipo de pieza (1-cartas simples, 2-paquetes y 3-sobres con vencimiento)");
            p.setTipoPieza(sc.nextInt());

            System.out.println("ingrese el peso de la pieza expresada en grm");
            p.setPeso(sc.nextInt());

            System.out.println("ingrese estado de la entrega de la pieza (1-entregado correctamente ,  0- no entregado");
            p.setEntrega(sc.nextInt());

            c.agregarProducto(p);

        }

        System.out.println("la cantidad de piezas:  " + c.cantidadPiezasSinEntregar());
        System.out.println("Suma de todos los pesos: " + c.sumatoriaPiezasTipo2());
        System.out.println("ingrese el Numero de pieza a buscar");
        int NroPieza = sc.nextInt();
        System.out.println("Entrega: " + c.DevolverEstadoEntregado(NroPieza));

    }

}
