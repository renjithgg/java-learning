public class JavaNullPointerException {
    public static void main(String[] args) {
        String foo = null;
        int length = foo.length();   // HERE
    }
}