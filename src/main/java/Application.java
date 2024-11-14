import nombre.Nombre;
import operation.Addition;
import operation.Division;
import operation.Operation;
import operation.Soustraction;
import operation.exception.DivisionParZeroException;
import operation.exception.ManqueOperandeException;
import operation.exception.OutOfCapicityException;

/**
 * Application cliente de la calculatrice<br/>
 * 
 * @author B. LEMAIRE
 * @version 1.0
 */
public class Application {

    public static void main( String [] args ){
        try {
            Nombre test = new Nombre(2);
            Nombre deux = new Nombre(2);
            Nombre trois = new Nombre(3);
            Nombre dixSept = new Nombre(17);


            Nombre soustraction = new Soustraction(dixSept, deux).valeur();
            Operation addition = new Addition(deux, trois);
            Operation division = new Division(soustraction, addition);

            System.out.println(division + " = " + division.valeur()); // affiche ((17 - 2) / (2 + 3)) = 3
        }
        catch (ManqueOperandeException | OutOfCapicityException  | DivisionParZeroException e) {
        	e.printStackTrace();
        }

    }
}
