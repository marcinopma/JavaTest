package codesprinters.autojava;

public abstract class AbstractShape extends Shapes {
	
	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

}
