public class IT24103971Lab3Q1B {
    public static void main(String[] args) {
        // Input price per kilogram
        double pricePerKg = 225;
        // Input number of kilogram to be bought
        double numOfKg = 5;
        // Calculate total before discount
        double totalAmount = pricePerKg*numOfKg;
        //Caluclate final value with discount of 10 percentage
        double totWithDiscount = totalAmount-totalAmount*0.1;
        System.out.println("The total amount with 10% discount is:" +totWithDiscount);
     }
}