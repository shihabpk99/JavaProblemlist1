import java.util.Scanner;
public class P4_factorial {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter a number: ");
     int n = scanner.nextInt();
        int result=1;
        for(int i=1; i<=n; i++){
            result = result *i;
        }


        System.out.println(result);

        scanner.close();
    }
    
}
