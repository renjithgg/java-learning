class JavaStaticKeywordParent {
    private int Id;
	protected String Name;
	public boolean Checked;
	
	static private int number = 10;
	static int counter = 1;
	
	public int public_counter = 100;
	
	JavaStaticKeywordParent(int idVal, String nameVal, boolean checkedVal) {
		this.Id = idVal;
		this.Name = nameVal;
		this.Checked = checkedVal;
	}
	
	static void getId() {
	   // System.out.println("Trying to access public variable in static method" + this.public_counter); // error: non-static variable this cannot be referenced from a static context
	   // System.out.println("Trying to access static variable in static method " + this.number); //  error: non-static variable this cannot be referenced from a static context
	   System.out.println("Trying to access static variable in static method " + number);
	}
}

class JavaStaticKeywordChild extends JavaStaticKeywordParent {
	private String Desc;
	
	JavaStaticKeywordChild(int idVal, String nameVal, boolean checkedVal, String descVal) {
		super(idVal, nameVal, checkedVal);
		this.Desc = descVal;
	}
	
	protected void printSomething() {
		System.out.println("Here is something printed in sub class");
	}
	
	protected String getName() {
		return this.Name;
	}	
	
	protected String getDescription() {
		return this.Desc;
	}
	
	// static method cannot be overridden
	// error: getId() in JavaStaticKeywordChild cannot override getId() in JavaStaticKeywordParent
	/*
	public void getId() {
		System.out.println("Trying to override static method");
	}
	*/
}

class JavaStaticKeyword {
	public static void main(String args[]) {
		
		/**** From base class START *********/
			System.out.println("From Base class ");
			JavaStaticKeywordParent.getId();
			// System.out.println(JavaStaticKeywordParent.number); // throws error
			System.out.println(JavaStaticKeywordParent.counter);
		/**** From base class END *********/
		
		/**** From sub class START *********/
			System.out.println("From Sub class ");
			JavaStaticKeywordChild.getId();
			// System.out.println(JavaStaticKeywordParent.number); // throws error
			System.out.println(JavaStaticKeywordChild.counter);
		/**** From sub class END *********/		
		
		JavaStaticKeywordChild sc = new JavaStaticKeywordChild(641, "Renjith", true, "I am learning Java");
		System.out.println("My name is "+ sc.getName());
		System.out.println("My detail is "+ sc.getDescription());
	}
}