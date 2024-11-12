package operation;
import expression.Expression;
import operation.exception.DivisionParZeroException;
import operation.exception.ManqueOperandeException;
import operation.exception.OutOfCapicityException;

/**
 * Division faisant intervenir deux opérandes de type Expression<br/>
 * @see Expression
 * @see Operation
 * @author B. LEMAIRE
 * @version 1.0
 */
public class Division extends Operation
{

	public Division(Expression operande1, Expression operande2) throws ManqueOperandeException, OutOfCapicityException {
		super( operande1, operande2 );
	}



	@Override
	public int valeur() throws DivisionParZeroException, ManqueOperandeException, OutOfCapicityException {

		// Vérification des opérandes
		super.valeur();  //<== la valeur de retour n'a pas d'importance

		/**
		 * Le diviseur ne doit pas être nul
		 */
		if (this.getOperande2().valeur()==0)
			throw new DivisionParZeroException("Division par zero !");

		int quotient = this.getOperande1().valeur() / this.getOperande2().valeur();
		// vérification du dépassement de capacité

		Expression.checkOperande( quotient );

		return quotient ;
	}
	

	public String toString()
	{
		return  "(" + this.getOperande1() + " / " + this.getOperande2() + ")" ; 
	}

}
