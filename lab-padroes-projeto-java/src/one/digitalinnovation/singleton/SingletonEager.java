package one.digitalinnovation.singleton;

/**
 * Singleton "preguiçoso"
 */
public class SingletonEager {

    private static SingletonEager instancia;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {


        return instancia;
    }
}