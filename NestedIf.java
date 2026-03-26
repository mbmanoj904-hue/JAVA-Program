import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        // int age=65;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age>=18){
            if(age>=65){
                System.out.println("Eligible to avail government fund");
            }
            else
                System.out.println("We are  eligible to vote and not avail government schme");
        }
        else {
        System.out.println("We are eligible to vote");
        sc.close();
    }
}  
}
    
        
    
    

