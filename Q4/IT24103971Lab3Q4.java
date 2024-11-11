import java.util.Scanner;

public class IT24103971Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
        // Extract the individual digits of the five-digit number
        int firstNum = number / 10000;       
        int secondNum = (number / 1000) % 10; 
        int thirdNum = (number / 100) % 10;  
        int fourthNum = (number / 10) % 10;  
        int fifthNum = number % 10;          
        
        // Print the digits separating them by spaces
        System.out.println(firstNum + " " + secondNum + " " + thirdNum + " " + fourthNum + " " + fifthNum);
        
        scanner.close();
    }
}
