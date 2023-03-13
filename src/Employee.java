public class Employee {
    // Properties or states
    int id;
    String fname;
    String lname;
    String pos;

    //Constructor
    public Employee() {
//        this.fname = "";
//        this.lname = "";
//        ย่้ายการทำงานไปอยู่ที่เดียว เพราะการทำงานเหมือนกัน
        this("?", "?");
    }

    // overload Constructor ชื่อเหมือนกัน แต่ parameter ต่างกัน ถ้ามี แล้ว default Constructor จะหายไป ต้องสร้าง default Constructor เอง
    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    // Behaviors or methods
    String getFullName() {
        return fname + " " + lname;
    }
}
