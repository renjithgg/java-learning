class DeprecatedTest 
{ 
	@Deprecated
	public void Display() 
	{ 
		System.out.println("Deprecatedtest display()"); 
	} 
} 

class DeprecatedTestSub extends DeprecatedTest {
	public void name() {
		System.out.println("My name is Renjith"); 
	}
}

public class SuppressWarning
{ 
	// If we comment below annotation, program generates 
	// warning 
	@SuppressWarnings({"checked", "deprecation"}) 
	public static void main(String args[]) 
	{ 
		//DeprecatedTest d1 = new DeprecatedTest(); 
		DeprecatedTestSub d = new DeprecatedTestSub();
		d.Display(); 
	} 
} 

	