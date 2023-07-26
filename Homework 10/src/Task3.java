import java.util.*;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 5 numbers:");
        Integer[] myArray = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        if (myArray[0] == myArray[4] && myArray[1] == myArray[3] && myArray[2] == myArray[2]) {
            System.out.println("Array is mirrored:" + Arrays.asList(myArray));
        } else {
            System.out.println("Array is not Mirrored!");
        }
    }
}





