package fachada;

public class SistemaFachada {
    private GestorCompra gestorCompra;
    private GestorInventario gestorInventario;
    private GesterEnvio gesterEnvio;

    public SistemaFachada() {
        this.gestorCompra = new GestorCompra();
        this.gestorInventario = new GestorInventario();
        this.gesterEnvio = new GesterEnvio();
    }

    public void Compra() {
        System.out.println("starting");
        gestorCompra.compar();
        gesterEnvio.enviarpedido();
        gestorInventario.retirarStock();

    }

}
