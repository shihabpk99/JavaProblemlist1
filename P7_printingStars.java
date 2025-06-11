import java.util.Scanner;

public class P7_printingStars {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the line num:  ");
        //int n = scanner.nextInt();
        int n= 5;

        for(int i=1; i<=n; i++){

            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
             for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
           
            System.out.println();
        }
        
        for(int i=n; i>=1; i--){

            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
             for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
           
            System.out.println();
        }

          for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

            for(int i=1; i<=n; i++){
             for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }


          for(int i=1; i<=n; i++){
             char al = 'A';
             for(int j=1; j<=i; j++){
                System.out.print(al+" ");
                al++;
            }
            System.out.println();
            
        }


        scanner.close();

    }
}
