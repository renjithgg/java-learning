package p2;
import p1.*;
class JavaAccessModifyClass {
	public static void main(String args[]) {
	  JavaAccessModifyFirstClass je = new JavaAccessModifyFirstClass(40, "Shijina");
	  // System.out.println(je.id); // throw error, because private access
      System.out.println(je.getId());  // works
	  System.out.println("test");
	  // System.out.println(je.protectedId); // Error, protected will not work in different package.
	  System.out.println(je.publicName);
	}
}

