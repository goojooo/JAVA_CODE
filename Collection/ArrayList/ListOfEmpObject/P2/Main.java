package ListOfEmpObject.P2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] ids = {1,2,3,4,5};
        String[] names = {"Aa","Ba","Ca","Da","Ea"};
        double[] salaries = {1100,2200,3300,4400,5500};

        List<Employee>list = new ArrayList<Employee>();
        for(int i = 0 ; i <= ids.length-1; i++)
        {
            Employee e = new Employee(ids[i],names[i],salaries[i]);
            list.add(e);
        }
        System.out.println("Details are : ");
        for(Employee e : list)
        {
            System.out.println(e.id + " " + e.name+ " " + e.salary);
        }
    }
}
