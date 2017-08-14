import java.io.*;
import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
       int n = sc.nextInt();
       int i,j,temp;
       int numOfSwaps=0;
       int a[] = new int[n];
       for(i=0;i<n;i++)a[i]=sc.nextInt();
       for(i=0;i<n-1;i++){
       for(j=0;j<n-i-1;j++){
       if(a[j]>a[j+1]){
       temp=a[j];
       a[j]=a[j+1];
       a[j+1]=temp;
       numOfSwaps++;
       }
       }
       }
       // for(i=0;i<n;i++)System.out.println(a[i]);
       System.out.println("Array is sorted in "+numOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}
