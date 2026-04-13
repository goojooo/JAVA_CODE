import java.util.ArrayList;
import java.util.List;

public class ClearList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 10; i <= 50; i += 10)
            list.add(i);

        if (list.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("List is not empty..");
        }

        list.clear();

        if (list.isEmpty()) {
            System.out.println("List is empty...");
        } else {
            System.out.println("List is not empty....");
        }
    }
}
