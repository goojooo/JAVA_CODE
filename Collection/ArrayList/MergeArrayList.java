import java.util.ArrayList;
import java.util.List;

public class MergeArrayList {
    public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<Integer>();
    for(int i = 1 ; i <= 5; i++)    
        System.out.println(l1.add(i*5));

    List<Integer> l2 = new ArrayList<Integer>();
    for(int i = 5 ; i >= 1 ; i--)
        System.out.println(l2.add(i*5));

    System.out.println("l1 list is : " + l1);

    l1.addAll(l2);

    System.out.println("l1 list after merge : " + l1);
    
    }
}
