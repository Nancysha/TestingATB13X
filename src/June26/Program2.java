package June26;

public class Program2 {
    public static void main(String[] args) {
        String s1= "Hello";String s2= "hello"; String s3= "Hello";
        //equals(): false, equalsIgnoreCase(): true, compareTo(): -32

        System.out.println(s1==s2);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
    }
}
