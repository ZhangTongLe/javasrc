/** An example of a Singleton implementation in Java.
 * The Singleton design pattern is described in GOF; the idea is to ensure
 * that only one instance of the class will exist in a given application.
 * @author Ian F. Darwin, ian@darwinsys.com
 * @version $Id$
 */
public class Singleton {

	private static Singleton singleton = new Singleton();

	/** A private Constructor prevents any other class from instantiating. */
	private Singleton() {
	}

	/** Static 'instance' method */
	public static Singleton getInstance() {
		return singleton;
	}

	// other methods protected by singleton-ness would be here...

	/** A simple demo method */
	public String demoMethod() {
		return "demo";
	}
}
