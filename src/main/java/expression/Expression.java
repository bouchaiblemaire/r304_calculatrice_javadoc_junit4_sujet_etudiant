package expression;

import operation.Operation;

public abstract class Expression {

	public abstract int valeur();

	public Expression getOperande1() {
		return null;
	}
	public Expression getOperande2() {
		return null;
	}

}