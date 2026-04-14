import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 10; i <= 100; i += 10) {
            list.add(i);
        }
        System.out.println("List is : " + list);
        System.out.println("Enter element to replace : ");
        int x = sc.nextInt();
        if (list.contains(x)) {
            System.out.println("Enter new element : ");
            int y = sc.nextInt();

            int loc = list.indexOf(x);
            list.set(loc, y);
            System.out.println("Updated list : " + list);
        } else {
            System.out.println("No such element is list...");
        }

    }
}
