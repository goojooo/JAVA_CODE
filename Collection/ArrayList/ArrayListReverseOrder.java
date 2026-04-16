import java.util.ArrayList;
import java.util.List;

public class ArrayListReverseOrder {
    public static void main(String[] args) {
    
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1 ; i <= 5 ; i++)
        {
            list.add(i*5);
        }

        System.out.println("List is :" + list);
        for(int i = list.size()-1 ; i >= 0 ; i--)
            System.out.print(list.get(i) + " ");
    }
}
