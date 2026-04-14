import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 10; i <= 50 ; i+=10)
        {
            list.add(i);
        }
        System.out.println("List is : " + list);
        System.out.println("Enter element to check in list : " );
        int ele = sc.nextInt();
        if(list.contains(ele))
            System.out.println("Yes ! Element is present...");
        else
            System.out.println("Element is not present...");
    }
}
