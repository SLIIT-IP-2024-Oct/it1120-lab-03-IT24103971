import java.util.Scanner;

public class IT24103971Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input values
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        System.out.print("Enter the num of OT hours: ");
        double otHours = scanner.nextDouble();
        System.out.print("Enter the OT hourly rate: ");
        double hourlyRate = scanner.nextDouble();
        
        // Calculate total salary
        double otAmount = otHours * hourlyRate;
        double totalSalary = monthlySalary + otAmount;
         
        // Print final value
        System.out.println("The total salary including OT is: "+totalSalary);

        scanner.close();
    }
}
        
        