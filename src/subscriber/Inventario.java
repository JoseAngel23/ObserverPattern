package subscriber;

import interfaces.ISubscriber;

/**
 *
 * @author Jose Forero Angel
 */
public class Inventario implements ISubscriber{
    String name;
	
    public Inventario(String name) {
	this.name = name;
	}
    
    @Override
    public void update(String message) {
        System.out.println("Eliminando los productos del inventario...");
    }
}
