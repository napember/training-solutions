package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b=false;
        System.out.println(b);

        int ii=2;
        System.out.println(ii);

        int i=3;
        int j=4;
        int k=i;
        System.out.println("i,j,k: "+i+","+j+","+k);

        {
            System.out.println("blokk i,j,k: "+i+","+j+","+k);
        }

        String s = "Hello World";

        String t = s;
        System.out.println(t);


    }
}
