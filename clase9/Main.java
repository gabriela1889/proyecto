public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("123456", "Gabriela");

        Camara cam = new Camara(1, "Canon", "X100");
        Foto[] fotos = { new Foto("playa.jpg"), new Foto("montaña.jpg") };
        Impresion imp = new Impresion(2, "Color", fotos);

        Producto[] productos = { cam, imp };
        Pedido pedido = new Pedido(cliente, productos, new java.util.Date(), 99998888);
        pedido.mostrarPedido();
    }
}