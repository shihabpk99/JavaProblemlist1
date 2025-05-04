public class P2_sum_of_ten_num {
    public static void main(String[] args) {
        // Initialize the sum variable
        int sum = 0;
        
        // Loop to get 10 numbers from the user
        for (int i = 1; i <= 10; i++) {
            // Prompt the user for input
            System.out.print("Enter number " + i + ": ");
            
            // Read the number from the user
            int num = new java.util.Scanner(System.in).nextInt();
            
            // Add the number to the sum
            sum += num;
        }
        
        // Print the total sum
        System.out.println("The total sum is: " + sum);
    }
}
