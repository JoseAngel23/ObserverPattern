package subscriber;

import interfaces.ISubscriber;

/**
 *
 * @author Jose Forero Angel
 */
public class carritoCompras implements ISubscriber{
    private String name;
	
    public carritoCompras(String name) {
	this.name = name;
	}
    @Override
    public void update(String message) {
        System.out.println("Eliminando los productos del carrito...");
    }
}
