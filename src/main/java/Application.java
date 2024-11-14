import expression.Expression;
import expression.Nombre;
import operation.Addition;
import operation.Division;
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
            Expression test = new Nombre(2);
            Expression deux = new Nombre(2);
            Expression trois = new Nombre(3);
            Expression dixSept = new Nombre(17);


            Expression s = new Soustraction(dixSept, deux);
            Expression a = new Addition(deux, trois);
            Expression d = new Division(s, a);

            System.out.println(d + " = " + d.valeur()); // affiche ((17 - 2) / (2 + 3)) = 3
        }
        catch (ManqueOperandeException | OutOfCapicityException  | DivisionParZeroException e) {
        	e.printStackTrace();
        }

    }
}
