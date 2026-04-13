import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 10; i <= 50; i += 10) {
            list.add(i);
        }
        System.out.println("List is : " + list);
        System.out.println("Enter index to insert : ");
        int loc = sc.nextInt();

        if (loc >= 0 && loc < list.size()) {
            System.err.println("Enter element to i0nsert : ");
            int element = sc.nextInt();
            list.add(loc, element);
            System.out.println("List is " + list);
        } else{
            System.out.println("Invalid index...");
        }
    }
}
