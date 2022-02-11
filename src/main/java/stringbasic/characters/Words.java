package stringbasic.characters;

public class Words {
    public static void main(String[] args) {
        String word = "Hello";

        char[] c = word.toCharArray();
        for(char ch:c) {
            System.out.println(ch);
        }

        char[] b = {'S','z','i','a','!'};
        String wordTest = new String(b);
        System.out.println(wordTest);

        byte[] bc = {97,98,99,100,};
        String wordTest1 = new String(bc);
        System.out.println(wordTest1);

    }
}
