package Practice;

//public class Data_Types_2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
import java.util.Scanner;

public class Data_Types_2 {
    // Fields
    double length;
    double width;
    double height;

    // Constructor
    public Data_Types_2(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate and return volume
    public double calculateVolume() {
        return length * width * height;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for box dimensions
        System.out.print("Enter length of the box: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height of the box: ");
        double height = scanner.nextDouble();

        // Create Box object
        Data_Types_2 userBox = new Data_Types_2(length, width, height);

        // Calculate and display volume
        double volume = userBox.calculateVolume();
        System.out.println("Volume of the box: " + volume);

        scanner.close();
    }
}

