import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveIndexElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1 ; i <= 10 ; i++)
        {
            list.add(i);
        }

        System.out.println("List is " + list);
        System.out.println("Enter index to remove : ");

        int loc = sc.nextInt();
        if(loc >= 0 && loc < list.size())
        {
            list.remove(loc);
            System.out.println("List is :-> " + list);
        } else{
            System.out.println("Error : No such index to remove...");
        }
    }
}
