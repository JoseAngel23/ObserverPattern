import notifiers.Payment;
import subscriber.carritoCompras;
import subscriber.Inventario;
import subscriber.productosComprados;

public class main {

	public static void main(String[] args) {
		Payment payment = new Payment();
		
		carritoCompras carrito = new carritoCompras("Carrito de Juan");
		Inventario inventario = new Inventario("Inventario de Juan");
                productosComprados productos = new productosComprados("Productos de Juan");
		
		payment.attach(carrito);
		payment.attach(inventario);
                payment.attach(productos);
		
		payment.notify("Pago completado.");
	}

}
