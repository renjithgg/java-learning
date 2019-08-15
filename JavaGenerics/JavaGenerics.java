class Base<T1, T2> {
	private T1 obj1;
	private T2 obj2;
	Base(T1 obj1Val, T2 obj2Val) {
		this.obj1 = obj1Val;
		this.obj2 = obj2Val;
	}
	
	public void getValues() {
		System.out.println(this.obj1 + " & " + this.obj2);
	}
	
	public<TM> void display(TM value) {
		System.out.println(value);
	}
	
	public<TV> TV displayValue(TV value) {
		return value;
	}
	
	public void setFirstObject(T1 value) {
		this.obj1 = value;
	}
	
	public T1 getFirstObject() {
		return obj1;
	}
	
	public void setSecondObject(T2 value) {
		this.obj2 = value;
	}
	
	public T2 getSecondObject() {
		return obj2;
	}
}

class JavaGenerics {
	public static void main(String args[]) {
		Base<String, Integer> b1 = new Base<String, Integer>("Renjith", 641);
		System.out.println("Name = "+ b1.getFirstObject());
		System.out.println("Id = "+ b1.getSecondObject());
		
		// Base<Double, Character> b2 = new Base<Double, Character>(12.5, 'R'); // before java 7
		Base<Double, Character> b2 = new Base<>(12.5, 'R');
		
		System.out.println("Pay money = "+ b2.getFirstObject());
		System.out.println("Pay char = "+ b2.getSecondObject());
		
		b1.display("Hello Renjith");
		b1.display(10);
		
		System.out.println(b1.displayValue(200));
		
		
		b2.setSecondObject('R');
		
		System.out.println(b2.getSecondObject());
		
	}
}