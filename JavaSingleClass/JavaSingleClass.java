class JavaSingleClass {
  private int id;
  private String name;
  
  public JavaSingleClass(int myId, String myName) {
     this.id = myId;
	 this.name = myName;
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
	  JavaSingleClass j = new JavaSingleClass(32, "Renjith");
      System.out.println(j.id);
  }
} 

