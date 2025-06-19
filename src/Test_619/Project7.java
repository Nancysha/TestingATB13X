package Test_619;

import java.util.Scanner;

public class Project7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Print first number");
        int a=sc.nextInt();

        Scanner sc1= new Scanner(System.in);
        System.out.println("Print second number");
        int b=sc1.nextInt();

        Scanner sc2= new Scanner(System.in);
        System.out.println("Print third number");
        int c=sc2.nextInt();

        if(a>=b && a>=c){
            System.out.println("Largest number is "+a);
        }
        else if(b>=a && b>=c){
            System.out.println("Largest number is "+b);
        }
        else{
            System.out.println("Largest number is "+c);
        }

    }
}
