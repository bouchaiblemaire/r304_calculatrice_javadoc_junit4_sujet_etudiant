package operation;
import expression.Expression;
import operation.exception.DivisionParZeroException;
import operation.exception.ManqueOperandeException;
import operation.exception.OutOfCapicityException;

/**
 * Multiplication faisant intervenir deux opérandes de type Expression<br/>
 * @see Expression
 * @see Operation
 * @author B. LEMAIRE
 * @version 1.0
 */
public class Multiplication extends Operation
{

	public Multiplication(Expression operande1, Expression operande2) throws ManqueOperandeException, OutOfCapicityException {
		super( operande1, operande2 );
	}


	@Override
	public int valeur() throws ManqueOperandeException, OutOfCapicityException
	{
		// Vérification du nombres d'opérandes
		super.valeur();  //<== la valeur de retour n'a pas d'importance

		// vérification du dépassement de capacité
		int produit = this.getOperande1().valeur() * this.getOperande2().valeur();
		Expression.checkOperande( produit );

		return produit ;
	}
	

	public String toString()
	{
		return  "(" + this.getOperande1() + " * " + this.getOperande2() + ")" ; 
	}

}
