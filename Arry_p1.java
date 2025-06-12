import java.util.Scanner;

public class Arry_p1 {
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int[] arry = { -3, -1, 1, 3, 5, 7, 9, 0, 2, 4, 6, 8, 10,};
System.out.print("Array: ");
for(int i=0; i<arry.length; i++){
    System.out.print(arry[i]+" ");

}

System.out.println();
System.out.print("Negative ele: ");
for(int i=0; i<arry.length; i++){
    if(arry[i]<0){
        System.out.print(arry[i]+ " ");
    }
}

System.out.println();
int total=0;
for(int i=0; i<arry.length; i++){    
    total=total+arry[i];
}
System.out.print("Avg of the Array: "+ String.format("%.3f",(double)total/arry.length)+" Total: "+total);


int min=0, max=0;
System.out.println();
for(int i=0; i<arry.length; i++){
    if(min>arry[i]){
        min=arry[i];
    }
    if(max<arry[i]){
        max=arry[i];
    }
}

System.out.println("Max ele: "+max +"  Min ele: "+min);

int scn_max= Integer.MIN_VALUE; // Start with the smallest possible integer

for(int i =0; i<arry.length; i++){
    if(arry[i]>scn_max && arry[i]<max){
        scn_max=arry[i];
    }
}
System.out.println("Second learge ele: "+scn_max);

scanner.close();

    }
}
