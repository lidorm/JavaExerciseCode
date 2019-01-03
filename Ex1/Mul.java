package test;

public class Mul extends BinaryExpression{
	public Mul(Expression left, Expression right) {
		super(left, right);
	}
public double calculate() {
		
		return (left.calculate())*(right.calculate());
	}

}
