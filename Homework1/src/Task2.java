import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number for A");
        float a =sc.nextInt();

        System.out.println("Input number for B");
        float b =sc.nextInt();

        System.out.println("Number A is "+a+ " Number B is "+b);

        float result1=a+b;
        System.out.println("The sum of A and B is "+result1);
        float result2 = a-b;
        System.out.println("The subtraction of A and B is "+result2);
        float result3=a*b;
        System.out.println("The multiplication of A and B is "+result3);
        float result4=(a/b);
        System.out.println("The division of A and B is "+result4);
        float result5=a%b;
        System.out.println("The reminder of division of A and B is "+result5);



    }
}
