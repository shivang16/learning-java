package challenges;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of one rupee: ");
        int oneRupee = scanner.nextInt();
        System.out.println("Enter number of five rupee: ");
        int fiveRupee = scanner.nextInt();
        System.out.println("Enter number of ten rupee: ");
        int tenRupee = scanner.nextInt();
        int totalMoney = oneRupee+5*fiveRupee+10*tenRupee;
        System.out.println("Total amount: "+totalMoney);
        if(totalMoney>100){
            System.out.println("Total amount is greater than 100 Rs.");
        }else{
            System.out.println("Total amount is less than 100 Rs. by "+(100-totalMoney));
        }
    }
}
