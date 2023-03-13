public class Main {
    public static void main(String[] args) {
        // default Constructor
        Employee test = new Employee();

        String resultTest = test.getFullName();
        System.out.println(resultTest);

        // Constructor
        Employee narawan = new Employee("Narawan", "Iamsaard");

        String result = narawan.getFullName();
        System.out.println(result);
    }
}
