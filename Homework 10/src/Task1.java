import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Task1 implements Collention {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Input 5 numbers:");
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 3 == 0) {
                System.out.println("the lowest number divisible by 3 is: " + list.get(i));
            }



        }

        //System.out.println(list);


    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public boolean add(Object element) {
        return false;
    }

    @Override
    public boolean remove(Object element) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeALL(Collection c) {
        return false;
    }

    @Override
    public boolean ContainsAll(Collection c) {
        return false;
    }
}

