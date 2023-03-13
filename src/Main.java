public class Main {
    public static void main(String[] args) {
        String fname = args[0];
        String lname = args[1];

        // default Constructor
        Employee test = new Employee();

        String resultTest = test.getFullName();
        System.out.println(resultTest);

        // Constructor
        Employee narawan = new Employee(fname, lname);

        String result = narawan.getFullName();
        System.out.println(result);
    }
}
