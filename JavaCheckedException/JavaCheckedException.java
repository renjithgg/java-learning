public class JavaCheckedException
{
    public static void main(String[] args)
    {
        Class.forName("AnyClassName");  
 
        //Compile time error because
        //above statement throws ClassNotFoundException which is a checked exception
        //this statement must be enclosed within try-catch block or declare main method with throws clause
    }
}