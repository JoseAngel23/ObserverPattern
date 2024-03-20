package subscriber;

import interfaces.ISubscriber;

/**
 *
 * @author Jose Forero Angel
 */
public class productosComprados implements ISubscriber{
    private String name;
	
    public productosComprados(String name) {
	this.name = name;
	}
    @Override
    public void update(String message) {
        System.out.println("Los productos comprados fueron: " + this.name);
    }
}
