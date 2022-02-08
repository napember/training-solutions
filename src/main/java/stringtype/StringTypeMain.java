package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello";
        String name = "John Doe";
        String message = prefix + " " + name;
        message += 444;
        boolean b = "Hello John Doe444".equals(message);

        System.out.println(message+ " " + (b ? "egyezik":"nem egyezik"));

        String s1="";
        String s2 = "";
        String s3 = s1+ s2;

        System.out.println("Concat: <" + s3+ "> length:" +s3.length() );

        s1="Abcde";
        System.out.println(s1+ " hossza: " + s1.length());

        System.out.println(s1.substring(0,1)+","+s1.substring(2,3)+ "," + s1.substring(0,3));
    }
}
