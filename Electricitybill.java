import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units");
        double units = sc.nextDouble();
        double bill =0.0;
        if(units<=150)
            bill=units*1.5;
        else
            bill=units*3.0;
        System.out.println("The elecrtricity bill is:"+bill);
        sc.close();
    }
    
}
