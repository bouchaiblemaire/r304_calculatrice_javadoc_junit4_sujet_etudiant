package operation;
import expression.Expression;
public class Soustraction extends Operation
{
	public Soustraction(Expression operande1, Expression operande2)  {
		super( operande1, operande2 );
	}

	@Override
	public int valeur()
	{
		return this.getOperande1().valeur() - this.getOperande2().valeur() ;
	}
	

	public String toString()
	{
		return  "(" + this.getOperande1() + " - " + this.getOperande2() + ")" ; 
	}

}
