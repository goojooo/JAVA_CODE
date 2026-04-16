package ListOfEmpObject.P1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();

        // Employee e1 = new Employee(101, "Nayan", 60000);
        // Employee e2 = new Employee(102, "Nyn", 50000);
        // Employee e3 = new Employee(103, "Nanna", 45000);

        // list.add(e1);
        // list.add(e2);
        // list.add(e3);

        list.add(new Employee(103, "Satya", 40000));

        // System.out.println("Details are : ");
        // for (Employee e : list) {
        //     System.out.println(e.id + " " + e.name + " " + e.sal);
        // }
        for (int i = 0; i <= list.size() - 1; i++) {
            Employee e = list.get(i);
            System.out.println(e.id + "	,	" + e.name + "	,	" + e.sal);
        }
    }
}
