package test;

public class Minus extends BinaryExpression{

	public Minus(Expression left, Expression right) {
		super(left, right);
	}
public double calculate() {
		
		return (left.calculate())-(right.calculate());
	}
}
