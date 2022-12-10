package challenges;

import java.util.Random;

public class LoopingChallenge {
    public static void main(String[] args) {
        Random random = new Random();
        int total = 0;
        for(int i=0;i<5;i++){
            int num = random.nextInt(6)+1;
            System.out.println("number is: "+num);
            total+=num;
        }
        System.out.println("Final score is: "+total);
        if(total>20)
            System.out.println("Number greater than 20 so bug");
        else if(total==20)
            System.out.println("Number equal to 20, you've won!");
        else
            System.out.println("Number less than 20, you lost");
    }
}
