package operation.exception;

/**
 * Exception non contrôlée levée lors d'une division par zéro
 * <br/>
 * @author B.L.
 * @version 1.0
 */
public class DivisionParZeroException extends RuntimeException {
    public DivisionParZeroException(String message) {
      super(message);
    }
}
