package operation;
import operation.exception.ManqueOperandeException;
import operation.exception.OutOfCapicityException;


/**
 * Soustraction faisant intervenir deux opérandes de type Expression<br/>
 * @see Nombre
 * @see Operation 
 * @author B. LEMAIRE
 * @version 1.0
 */
public class Soustraction extends Operation
{

	public Soustraction(Nombre operande1, Nombre operande2) throws ManqueOperandeException, OutOfCapicityException {
		super( operande1, operande2 );
	}


	@Override
	public int valeur() throws ManqueOperandeException, OutOfCapicityException
	{
		// Vérification du nombres d'opérandes
		super.valeur();  //<== la valeur de retour n'a pas d'importance

		// vérification du dépassement de capacité
		int soustraction = this.getOperande1().valeur() - this.getOperande2().valeur();
		Operation.checkOperande( soustraction );

		return soustraction ;
	}
	

	public String toString()
	{
		return  "(" + this.getOperande1() + " - " + this.getOperande2() + ")" ; 
	}

}
