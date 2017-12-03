package codesprinters.autojava;

public class Square extends Rectangle {

	public Square(double a) {
		super(a, a);
	}

	public static double getSide() {
		return super.getA();
	}

}
