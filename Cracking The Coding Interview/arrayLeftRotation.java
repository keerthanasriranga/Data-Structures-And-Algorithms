import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int temp=0,j;
        for(int i=0; i < n; i++){
           int newLocation = (i + (n - k)) % n;
           a[newLocation] = in.nextInt();
            //for right rotation use : int newLocation = (i + (n + k)) % n;
        }
           for(int i=0; i < n; i++)System.out.print(a[i]+" ");
        }
       
}
