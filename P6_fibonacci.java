import java.util.Scanner;
public class P6_fibonacci {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any num: ");

        int n = scanner.nextInt();

        System.out.println("Fibonacci serise: ");
        
        int fst=0, sc=1, nxt;

        for(int i=1; i<=n; i++){
             
            System.out.print(fst+ " ");

            nxt = fst+sc;
            fst=sc;
            sc=nxt;

        }



        scanner.close();

    }
    
}
