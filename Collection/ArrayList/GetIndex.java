import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 10 ; i<=50; i+=10)
        {
            list.add(i);
        }
        System.out.println("List is : " + list);
        System.out.println("Enter the index value : " );
        int loc = sc.nextInt();
        System.out.println("Element @ index - " + loc + " is " + list.get(loc));
    }
}
