package test;

public class Base {
	public int n1 = 100;
	protected int n2 = 100;
	int n3 = 100;
	private int n4 = 100;

	public Base() {
		System.out.println("base()....");
	}

	public void test100() {
		System.out.println("test100");
	}

	protected void test200() {
		System.out.println("test200");
	}

	void test300() {
		System.out.println("test300");
	}

	private void test400() {
		System.out.println("test400");
	}

}
