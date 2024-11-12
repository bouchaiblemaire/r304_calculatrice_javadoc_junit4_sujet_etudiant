package operation.exception;

/**
 * Exception contrôlée levée en cas de dépassement de capacité
 * <br/>
 * @author B.L.
 * @version 1.0
 */
public class OutOfCapicityException extends Exception { //<== C'est une exception contrôlée
    private int faultyValue;

     /**
      * Constructor
      * @param message explain the situation
      * @param faultyValue origin of the exception
      */
     public OutOfCapicityException(String message, int faultyValue) {
      super(message);
      this.faultyValue = faultyValue;
     }

    /**
     * get the faulty value
     * @return (int) faulty value
     */
    public int getFaultyValue() {
        return faultyValue;
    }
}
