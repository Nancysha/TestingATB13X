package Test_619;

import java.util.Scanner;

public class Project6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Print the number");
        int a=sc.nextInt();

        if(a>=1 && a<=100)
        {
            System.out.println(a + " is positive");
        }
        else if (a<=-1 && a >=-100){
            System.out.println(a +" is negative");
        }
        else
        {
            System.out.println(a+" is zero");
        }

    }
}
