class JavaAccessModifyFirstClass {
  private int id;
  private String name;
  protected int protectedId;
  public String publicName;
  
  JavaAccessModifyFirstClass(int myId, String myName) {
     this.id = myId;
	 this.name = myName;
	 this.protectedId = myId;
	 this.publicName = myName;
  }
  
  public void setId(int idVal) {
    this.id = idVal;
  }
  
  public int getId() {
    return this.id;
  }
  
  public void setName(String nameVal) {
	this.name = nameVal;
  }
  
  public String getName() {
	return this.name;
  }
  
  public static void main(String args[]) {
	  JavaAccessModifyFirstClass je = new JavaAccessModifyFirstClass(32, "Renjith");
      System.out.println(je.id);
  }
} 

class JavaAccessModifyClass {
	public static void main(String args[]) {
	  JavaAccessModifyFirstClass je = new JavaAccessModifyFirstClass(40, "Shijina");
	  // System.out.println(je.id); // throw error, because private access
      System.out.println(je.getId());  // works
	  System.out.println(je.protectedId);
	  System.out.println(je.publicName);
	}
}

