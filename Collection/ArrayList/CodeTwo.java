import java.util.ArrayList;
import java.util.List;

public class CodeTwo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        if (list.isEmpty())
            System.out.println("List is empty...");
        else
            System.out.println("List contains elements");
    }
}