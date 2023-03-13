import java.util.*;

public class DemoCollectionFramework {

    public static void main(String[] args) {
//        List
        // ClassCastException
        List users1 = new ArrayList();
        users1.add("Narawan");
        users1.add(1234);

        // มี type กำกับดีกว่า Generic type ทำให้ code java safety มากขึ้น
        List<String> users2 = new ArrayList<>();
        users2.add("Narawan");
        users2.add("1234");

        for (String user : users2) {
            System.out.println(user);
        }

        for (int i = 0; i < users2.size(); i++) {
            System.out.println(users2.get(i));
        }

//        Map
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee("f1", "l1"));
        employeeMap.put(2, new Employee("f2", "l2"));
        employeeMap.put(15, new Employee("f15", "l15"));

        Employee employee = employeeMap.get(15);
        System.out.println(employee.getFullName());

        // loop Iterate
        Set<Integer> keys = employeeMap.keySet();
        for (Integer key : keys) {
            Employee e = employeeMap.get(key);
            System.out.println("Data > "+e.getFullName());
        }
    }

}
