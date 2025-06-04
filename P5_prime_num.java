import java.util.Scanner;
public class P5_prime_num {


  public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any num: ");

      int n = scanner.nextInt();
      int check = 0;

        for(int i=2; i<n; i++){
            if(n%i==0){
              check =1;
              break;
            }
        }
        if(check==1){
              System.out.println("It is a not prime number.");
        }else{
              System.out.println("It is a prime number.");
        }


    scanner.close();
  }  
}
