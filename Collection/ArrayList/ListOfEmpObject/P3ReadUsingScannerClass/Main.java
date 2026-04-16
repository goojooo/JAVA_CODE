package ListOfEmpObject.P3ReadUsingScannerClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 employees details : ");
        for(int i = 1 ; i <= 3 ; i++)
        {
            System.out.println("Enter emp -" + i + " details .");
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();
            Employee e = new Employee(id, name, salary);
            list.add(e);

        }
        System.out.println("Details are : ");
        for(Employee e : list)
        {
            System.out.println(e.id+ " " + e.name+ " " + e.salary);
        }
    }
}
