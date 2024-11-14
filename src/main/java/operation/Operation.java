package operation;

import operation.exception.ManqueOperandeException;
import operation.exception.OutOfCapicityException;

/**
 * Classe abstraite qui représente une opération arithmétique avec deux opérandes
 * de type Expression<br/>
 * @see Nombre
 * @author B.LEMAIRE
 * @version : 1.0
 */

public abstract class Operation extends Nombre {

	private Nombre operande1;
	private Nombre operande2;

	public Operation(Nombre operande1, Nombre operande2) throws ManqueOperandeException, OutOfCapicityException {
		
		if (operande1 == null || operande2 == null)
			throw new ManqueOperandeException( operande1, operande2);

		// Vérification des dépassements de capacités
		Operation.checkOperande(operande1.valeur());
		Operation.checkOperande(operande2.valeur());

		this.operande1 = operande1;
		this.operande2 = operande2;
	}

	public Nombre getOperande1() {
		return this.operande1;		
	}

	public Nombre getOperande2() {
		return this.operande2;
	}


	/**
	 * Evalue la valeur de l'expression
	 * @return  (int) valeur de l'expression
	 * @throws OutOfCapicityException dépassement de capacités (exception contrôlée)
	 */
	@Override
	public int valeur() throws ManqueOperandeException, OutOfCapicityException
	{
		if (operande1 == null || operande2 == null)
			throw new ManqueOperandeException( operande1, operande2);

		return 0 ; // <== La valeur de retour n'a pas de signification
	}


	/**
	 * Static méthod
	 * Vérifie si operandeToCheck est dans les limites de capacités de la calculatrice
	 * @param operandeToCheck operande à vérifier
	 * @throws OutOfCapicityException dépassement de capacités (exception contrôlée)
	 */
	// static : méthode de classe !
	public static void checkOperande(int operandeToCheck) throws OutOfCapicityException {
		if (operandeToCheck < UNDERFLOW_LIMIT ){
			throw new OutOfCapicityException("Underflow !", operandeToCheck);
		}

		if (operandeToCheck > OVERFLOW_LIMIT){
			throw new OutOfCapicityException("Overflow !", operandeToCheck);
		}
	}
	/**
	 * Accesseur à la première opérande<p>
	 * Renvoie
	 * <ul>
	 * <li>null si l'expression est un nombre</li>
	 * <li>la valeur de la première opérande si l'expression est une opération</li>
	 * </ul>
	 * @return  (Nombre) qui représente la première opérande de l'expression
	 */
	public Nombre getOperande1() {
		return null;
	}

	/**
	 * Accesseur à la deuxième opérande
	 * <p>
	 * Renvoie
	 * <ul>
	 * <li>null si l'expression est un nombre</li>
	 * <li>la valeur de la deuxième opérande si l'expression est une opération</li>
	 * </ul>
	 * @return  (Expression) qui représente la deuxième opérande de l'expression
	 */
	public Nombre getOperande2() {
		return null;
	}


}