import java.util.Scanner;

public class P3_hermonicSer {
    public static void main(String[] args){

 Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

double tol=0.00;
        for(int i=1; i<=n; i++){
            tol=tol+(1.00/i);
        }
 System.out.println(tol);

        scanner.close();
        }

    }
    

