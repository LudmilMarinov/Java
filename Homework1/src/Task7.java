import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("What time is it?");
        int time= sc.nextInt();
        System.out.println("How much money do you have?");
        double cash= sc.nextDouble();
        System.out.println("Are you healthy?");
        boolean health= sc.nextBoolean();


        if ((!health)&&(cash>10)){
            System.out.println("I wont go out and buy medications.");
        }
        if ((!health)&&(cash<10)){
            System.out.println("I will stay home and drink tea.");
        }

        if((health)&& (cash<10)) {
            System.out.println("I will go to drink coffee.");
        }

    }
}
