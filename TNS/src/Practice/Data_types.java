package Practice;
//
//public class Data_types {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

//}
public class Data_types {
    // Fields (instance variables)
    String name;
    int age;
    double salary;

    // Constructor
    public Data_types(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to print employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : ₹" + salary);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an Employee object
    	Data_types emp1 = new Data_types("Kadari Mohan", 24, 45000.0);

        // Displaying employee details
        emp1.displayDetails();
    }
}
