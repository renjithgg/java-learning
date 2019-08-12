abstract class Base {
   abstract void display();
   
   public void someBaseMethod() {
		System.out.println("Some method in base class");
   }
}

abstract class SubOne extends Base {
	public void someSubOneMethod() {
		System.out.println("Some method in derived/sub SubOne class");
    }
}

class SubTwo extends SubOne {
	public void someSubTwoMethod() {
		System.out.println("Some method in derived/sub SubTwo class");
    }
	
	void display() {
		System.out.println("I am implementing Base substract method");
	}
}

class JavaAbstract {
	public static void main(String args[]) {
		
		// SubOne so = new SubOne(); // error: SubOne is abstract; cannot be instantiated
		
		SubTwo st = new SubTwo();
		st.someBaseMethod();
		st.someSubOneMethod();	
		st.someSubTwoMethod();		
		st.display();
	}
}