package p1;
public class JavaAccessModifyFirstClass {
  private int id;
  private String name;
  protected int protectedId;
  public String publicName;
  
  public JavaAccessModifyFirstClass(int myId, String myName) {
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
  
} 