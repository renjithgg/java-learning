class JavaEncapsulationFirstClass {
  private int id;
  private String name;
  
  JavaEncapsulationFirstClass(int myId, String myName) {
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
} 

class JavaEncapsulationClass {
	public static void main(String args[]) {
	  JavaEncapsulationFirstClass je = new JavaEncapsulationFirstClass(40, "Shijina");
      System.out.println(je.getId());
	}
}

