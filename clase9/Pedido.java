import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void mostrarPedido() {
        System.out.println("Fecha del pedido: " + fecha);
        System.out.println("Número de tarjeta: " + numeroTarjetaCredito);
        System.out.println("\nProductos del pedido:");
        for (Producto p : productos) {
            if (p instanceof Camara) {
                Camara cam = (Camara) p;
                System.out.println("--- Producto #" + p.getNumero() + " → Cámara ---");
                System.out.println("   Marca: " + cam.getMarca());
                System.out.println("   Modelo: " + cam.getModelo());
            } else if (p instanceof Impresion) {
                Impresion imp = (Impresion) p;
                System.out.println("--- Producto #" + p.getNumero() + " → Impresión ---");
                System.out.println("   Color: " + imp.getColor());
                System.out.println("   Fotos:");
                for (Foto f : imp.getFotos()) {
                    f.print();
                }
            }
        }
    }
}