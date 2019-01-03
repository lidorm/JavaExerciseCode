package test;

public class Number implements Expression {
private double value;

public Number(double value) {
	this.value=value;
}
public void setValue(double val) {
	this.value=val;
}
@Override
public double calculate() {
	return value;
}


}