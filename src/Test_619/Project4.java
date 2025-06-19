package Test_619;

public class Project4 {
    public static void main(String[] args) {
        int a=5;

        //Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)
        System.out.println("Original "+a);
        a=++a;
        System.out.println("Pre-increment :"+a);
        a=a++;
        System.out.println("Post-increment :"+a +"(returned 6");
        a=--a;
        System.out.println("Pre-decrement:"+a);
        a=a--;
        System.out.println("Post-decrement:"+a+"(returned 5)");
    }
}
