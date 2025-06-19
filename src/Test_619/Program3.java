package Test_619;

public class Program3 {
    public static void main(String[] args) {
        int a= 10; int b=5;
        //a == b: false a < b: false !(a > b): false
        // a > b: true  (a > b) && (a > 0): true (a < b) || (a > 0): true
        if((a==b)||(a<b)||!(a>b))
        {
            System.out.println("False");
        } else if((a>b)||((a>b)&&(a>0))||(a < b) || (a > 0))
        {
            System.out.println("true");
        } else {
            System.out.println("Invalid");
        }
    }
}
