package ListOfEmpObject.P4BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Enter emp details to add : ");
                int id = Integer.parseInt(br.readLine());
                String name = br.readLine();
                double salary = Double.parseDouble(br.readLine());

                Employee e = new Employee(id, name, salary);
                list.add(e);

                System.out.println("Want to add more record (y/n)?");
                String choice = br.readLine();
                if (choice.equalsIgnoreCase("n")) {
                    break;
                }
            }

            System.out.println("Details are : ");
            for (Employee e : list) {
                System.out.println(e.id + " " + e.name + " " + e.salary);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}