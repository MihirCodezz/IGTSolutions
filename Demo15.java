class A {
	
	A() {
		System.out.println("A()");
	}

	A(int a) {
		System.out.println("A(int a)");
	}

	A(int a, String s) {
		System.out.println("A(int a, String s)");
	}
}

class Demo15 {
	
	public static void main(String[] args) {
		
		A a = new A();
		A a1 = new A(10);
		A a2 = new A(20, "mohit");
	}
}