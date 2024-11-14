package operation.exception;

import nombre.Nombre;

/**
 * Exception non contrôlée qui est levée si une opération n'a pas pu être correctement instantiée
 * car le nombre d'opérande est incorrect<br/>
 * 
 * Encapsule les opérandes qui ont provoquées la levée de l'exception
 * 
 * @author B.L.
 * @version : 1.0
 */

public class ManqueOperandeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Operande 1
	 */
	private Nombre operande1;
	
	/**
	 * Operande 2
	 */
	private Nombre operande2;
	

	/**
	 * Constructeur qui initialise l'exception
	 * <p>
	 * Encapsule les opérandes qui ont provoquées la levée de l'exception
	 * @param operande1  (Nombre) première opérande
	 * @param operande2  (Nombre) deuxième opérande
	 */
	public ManqueOperandeException(Nombre operande1, Nombre operande2) {
		// TODO Auto-generated constructor stub
		this.operande1 = operande1;
		this.operande2 = operande2;
	}



	/**
	 * Accesseur à la première opérande présente au moment de la lévée de l'exception
	 * @return  (Expression)  première opérande
	 */
	public Nombre getOperande1() {
		return operande1;
	}



	/**
	 * Accesseur à la deuxième opérande présente au moment de la lévée de l'exception
	 * @return  (Expression)  deuxième opérande
	 */
	public Nombre getOperande2() {
		return operande2;
	}



	/**
	 * Rapport de concernant l'exception
	 * 
	 * @return (String) Chaine contenant un log qui caractérise l'exception
	 */
	public String getMessage() {
		
		String rapport = "##########################################";
		rapport = rapport + "Erreur sur les opérandes de l'opération\n";
		rapport = rapport + " operande 1 = " + this.getOperande1()+"\n";
		rapport = rapport + " operande 2 = " + this.getOperande2()+"\n";
		rapport = rapport + "##########################################";
		
		return rapport;
	}
	

}
