interface GenericInterface<T>
{
    void setT(T t);    
 
    T getT();
}

class GenericClass<T> implements GenericInterface<T>
{
    T t;
 
    //Implementing setT() method
 
    @Override
    public void setT(T t)
    {
        this.t = t;
    }
 
    //Implementing getT() method
 
    @Override
    public T getT()
    {
        return t;
    }
}

class JavaGenericInterface {
	public static void main(String args[]) {
		GenericClass<String> g1= new GenericClass<String>();
		g1.setT("Renju");
		System.out.println(g1.getT());
		
		GenericClass<Integer> g2= new GenericClass<Integer>();
		g2.setT(32);
		System.out.println(g2.getT());		
	}
}