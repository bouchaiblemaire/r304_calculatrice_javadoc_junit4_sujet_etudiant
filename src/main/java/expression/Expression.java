package expression;

import operation.Operation;
import operation.exception.OutOfCapicityException;

/**
 * Représente une expression mathématique :
 * <ul>
 * <li>Un nombre</li>
 * <li>Une opération</li>
 * </ul>
 * @see Operation
 * @see Nombre
 * 
 * @author B.L.
 * @version 1.0
 */
public abstract class Expression {

	public static final int UNDERFLOW_LIMIT = -27000;
	public static final int OVERFLOW_LIMIT = 27000;

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
	 * Evalue la valeur de l'expression
	 * @return  (int) valeur de l'expression
	 * @throws OutOfCapicityException dépassement de capacités (exception contrôlée)
	 */
	public abstract int valeur() throws OutOfCapicityException;

    /**
     * Accesseur à la première opérande<p>
     * Renvoie 
     * <ul>
     * <li>null si l'expression est un nombre</li>
     * <li>la valeur de la première opérande si l'expression est une opération</li>
     * </ul>
     * @return  (Expression) qui représente la première opérande de l'expression
     */
	public Expression getOperande1() {
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
	public Expression getOperande2() {
		return null;
	}

}