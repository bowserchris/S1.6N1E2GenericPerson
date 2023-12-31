package n1e2;

public class GenericMethods <T>{
	
	private T t1;
	private T t2;
	private T t3;
	
	public GenericMethods(T t1, T t2, T t3) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}

	public T getT2() {
		return t2;
	}

	public void setT2(T t2) {
		this.t2 = t2;
	}

	public T getT3() {
		return t3;
	}

	public void setT3(T t3) {
		this.t3 = t3;
	}
	
	public void print(T t1, T t2, T t3) {
		System.out.println("The first type " + t1 + " the second type " + t2 + " the third type " + t3 + ".\r");
	}

	@Override
	public String toString() {
		return "GenericMethods [t1=" + t1 + ", t2=" + t2 + ", t3=" + t3 + "]";
	}
	
	

}
