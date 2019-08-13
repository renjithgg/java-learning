public class JavaClassCastException {
    public static void main(String[] args) {
		Object i = Integer.valueOf(42);
		String s = (String)i;   
    }
}