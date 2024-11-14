package operation;

import expression.Expression;
import operation.exception.DivisionParZeroException;
import operation.exception.ManqueOperandeException;
import operation.exception.OutOfCapicityException;

/**
 * Classe abstraite qui représente une opération arithmétique avec deux opérandes
 * de type Expression<br/>
 * @see Expression
 * @author B.LEMAIRE
 * @version : 1.0
 */

public abstract class Operation extends Expression {

	private Expression operande1;
	private Expression operande2;

	public Operation(Expression operande1, Expression operande2) throws ManqueOperandeException, OutOfCapicityException {
		
		if (operande1 == null || operande2 == null)
			throw new ManqueOperandeException( operande1, operande2);

		// Vérification des dépassements de capacités
		Expression.checkOperande(operande1.valeur());
		Expression.checkOperande(operande2.valeur());

		this.operande1 = operande1;
		this.operande2 = operande2;
	}

	public Expression getOperande1() {
		return this.operande1;		
	}

	public Expression getOperande2() {
		return this.operande2;
	}



	@Override
	public int valeur() throws ManqueOperandeException, OutOfCapicityException
	{
		if (operande1 == null || operande2 == null)
			throw new ManqueOperandeException( operande1, operande2);

		return 0 ; // <== La valeur de retour n'a pas de signification
	}



}