import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number for a1");
        int a1= sc.nextInt();
        System.out.println("Input number for a2");
        int a2= sc.nextInt();
        System.out.println("Input number for a3");
        int a3= sc.nextInt();

        int temp=a1;
        a1=a2;
        a2=a3;
        a3=temp;

        System.out.println("New a1 is "+a1);
        System.out.println("New a2 is "+a2);
        System.out.println("New a3 is "+a3);
    }
}