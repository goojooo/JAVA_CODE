import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1 ; i <=5 ; i++)
        {
           list.add(i); 
        }

        System.out.println("List is : ");
        for(Integer x : list)
            System.out.println(x);
    }
}
