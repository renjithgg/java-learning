package p1;
class JavaAccessModifyClass {
	public static void main(String args[]) {
	  JavaAccessModifyFirstClass je = new JavaAccessModifyFirstClass(40, "Shijina");
	  // System.out.println(je.id); // throw error, because private access
      System.out.println(je.getId());  // works
	  System.out.println("test");
	  System.out.println(je.protectedId);
	  System.out.println(je.publicName);
	}
}

