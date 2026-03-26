import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the age");
        // int age = sc.nextInt();
        // if(age>=18)
        //     System.out.println("Eligible");
        // sc.close();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
         int b = sc.nextInt();
         if(a>b)
            System.out.println("a is larger");
        else
            System.out.println("b is larger");
        sc.close();
    }
}
