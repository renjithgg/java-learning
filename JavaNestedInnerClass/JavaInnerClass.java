class OuterClass {
	private int outerClassVar = 10;
	protected String name = "Shijina";
	protected static byte myAge = 32;
	
	public void outerClassDisplayName() {
		System.out.println("Renjith");
	}	
	
	public void outerClassDisplayInnerClassField() {
		System.out.println(new NestedInnerClass().nestedClassVar);
	}
	
	class NestedInnerClass {
		private int nestedClassVar = 20;
		
		public void innerClassDisplayVariable() {
			System.out.println(outerClassVar);
		}
	}
	
	static class StaticNestedInnerClass {
		public void staticNestedInnerClassDisplay() {
			System.out.println("I am static nested inner class method");
		}
		
		public void accessNonStaticField() {
			//System.out.println(name);  //error: non-static variable name cannot be referenced from a static context
		}
		
		public void accessOnlyStaticField() {
			System.out.println("I can only access static field from outer class" + "My age = " + myAge);  
		}		
	}
	
	public void methodLocal() {
		class MethodLocalInnerClass {
			public void methodLocalInnerClassDisplay() {
				System.out.println("I am method local inner class method");
			}
		}
		MethodLocalInnerClass methodLocalInnerC = new MethodLocalInnerClass();
		methodLocalInnerC.methodLocalInnerClassDisplay();
	}
}


class JavaInnerClass {
	public static void main(String args[]) {
		OuterClass outerC = new OuterClass();
		outerC.outerClassDisplayName(); 
		
		outerC.outerClassDisplayInnerClassField();
		
		outerC.methodLocal();
		
		//OuterClass.NestedInnerClass innerC = new OuterClass.new NestedInnerClass(); // error: <identifier> expected
		OuterClass.NestedInnerClass innerC = outerC.new NestedInnerClass();
		innerC.innerClassDisplayVariable();
		
		OuterClass.StaticNestedInnerClass staticInnerC = new OuterClass.StaticNestedInnerClass();
		staticInnerC.staticNestedInnerClassDisplay();
		staticInnerC.accessOnlyStaticField();
	}
}