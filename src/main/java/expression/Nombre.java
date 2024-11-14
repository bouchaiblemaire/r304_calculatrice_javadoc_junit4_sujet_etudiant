package expression;

import operation.Operation;
import operation.exception.OutOfCapicityException;

/**
 * Encapsule un nombre constant entier<br>
 *
 * @author B.L.
 * @version : 1.0
 * @see Expression
 */


public class Nombre extends Expression {
	private int valeurNombre; // Entier encapsulé

	/**
	 * Constructeur
	 *
	 * @param uneValeur valeur entière qui sera encapsulé par Nombre
	 * @throws OutOfCapicityException Erreur sur les opérandes (exception contrôlée)
	 */
	public Nombre(int uneValeur) throws OutOfCapicityException {
		super();

		// Vérification des dépassements de capacités
		Expression.checkOperande(uneValeur);
		this.valeurNombre = uneValeur;
	}

	/**
	 * Evalue la valeur du Nombre
	 *
	 * @return (int) valeur encapsulé par Nombre
	 * @throws OutOfCapicityException dépassement de capacités (exception contrôlée)
	 */
	public int valeur() throws OutOfCapicityException {
			Expression.checkOperande(this.valeurNombre);

			return this.valeurNombre;
		}

		/**
		 * Représentation du Nombre courant sous forme d'une chaîne de caractères
		 * @return (String) chaine de caractères représentant le nombre
		 */
		public String toString () {
			return Integer.toString(this.valeurNombre);
		}

}
// fin classe partie_1.correction_partie_1.Nombre
