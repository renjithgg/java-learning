interface InterfaceOne {
  static int i = 10;
  void display();
}

class Base implements InterfaceOne {
	public void someMethod() {
	   System.out.println("I am base method");
	}
	
	public void display() {
		System.out.println("I am interface method implementation");
	}
}

class JavaInterface {
	public static void main(String args[]) {
		Base b = new Base();
		b.someMethod();
				
		System.out.println("Static access of variable i " + InterfaceOne.i);
		System.out.println("Object access of variable i " + b.i);
	}
}