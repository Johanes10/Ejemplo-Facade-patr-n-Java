package fachada;

public class GestorCompra {

    int numCuenta = 5000;
    boolean estadoPago = true;
    float valor = 1000;

    public void compar() {
    System.out.println("detalles de compra:" + "\n" + "numero de cuenata:"+ numCuenta + "\n" + "estado de pago:" + estadoPago + "\n" + "valor" + valor +"");
    }

}
