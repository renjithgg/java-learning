class Base implements Cloneable {
	private double i, j;
	Base(double iVal, double jVal) {
		this.i = iVal;
		this.j = jVal;
	}
	
	/*
	public String toString() {
		return i + " Ok " + j;
	} */
	
	public int hashCode() {
		return (int) i;
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  	
	
	public void displayMyName() {
		System.out.println("Renju");
	}
}

class JavaObjectClass {
	public static void main(String args[] ) {

		Base b = new Base(34346, 23.7);
		Base bb = new Base(12.5, 23.7);
		System.out.println(b);
		System.out.println(b.toString());
		System.out.println(b.getClass());
		System.out.println(b.equals(bb));
		
		Integer k = new Integer(20);
		Integer l = new Integer(20);
		System.out.println(k.equals(l));
		
		System.out.println(b.getClass());
		
		// Object obj = new String("GeeksForGeeks"); 
		String obj = new String("GeeksForGeeks"); 
        Class c = obj.getClass(); 
        System.out.println("Class of Object obj is : "+ c.getName()); 
			
		try {
			Base bClone = (Base)b.clone();
			bClone.displayMyName();
		} catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		
	}
}