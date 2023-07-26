import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number for A");
        double a =sc.nextDouble();

        System.out.println("Input number for B");
        double b =sc.nextDouble();

        System.out.println("Number A is " +a);
        System.out.println("Number B is " +b);

        System.out.println("Input number for C");
        double c =sc.nextDouble();

        System.out.println("Number C is " +c);

        if (a<c && c<b){
            System.out.println("The number "+c+" is between "+a+" and "+b);
        }else{
            System.out.println("The number "+c+" is not between "+a+" and "+b);
        }
    }
}
