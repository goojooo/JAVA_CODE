package ListOfEmpObject.P4UserCmdOnStores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Scanner s = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter emp details to add : ");
            int id = s.nextInt();
            String name = s.next();
            double salary = s.nextDouble();

            Employee e = new Employee(id, name, salary);
            list.add(e);

            System.out.println("Do u want to add another record (y/n) : ");
            String choice = s.next();
            if(choice.equals("n"))
            {
                break;
            }
        }
        System.out.println("Details are :");
        for(Employee e : list)
        {
            System.out.println(e.id +" "+e.name+" " +e.salary);
        }
    }
}
