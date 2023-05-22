package org.Logics;

public class Fibonacci {

	public void methods() {
		System.out.println("First Methods");
	}

	static {
		int a = 1, b = 0, c = 0;
		for (int i = 1; i <= 5; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}

	}

	{
		System.out.println("Instance Blocks");
	}

	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		fibo.methods();
	}

}
