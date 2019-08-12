class Base<T1, T2> {
	T1 obj1;
	T2 obj2;
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
}

class JavaGenerics {
	public static void main(String args[]) {
		Base<String, Integer> b1 = new Base<String, Integer>("Renjith", 641);
		System.out.println("Name = "+ b1.obj1);
		System.out.println("Id = "+ b1.obj2);
		
		Base<Double, Character> b2 = new Base<Double, Character>(12.5, 'R');
		System.out.println("Pay money = "+ b2.obj1);
		System.out.println("Pay char = "+ b2.obj2);
		
		b1.display("Hello Renjith");
		b1.display(10);
	}
}