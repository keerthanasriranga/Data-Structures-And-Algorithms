/*You will be given two arrays of integers. You will be asked to determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int count=0;
       int range = b[0]/a[n-1];
        for(int i=1;i<=range;i++){
            int flag=1;
            int num = a[n-1]*i;
            for(int x : a){
                if(num%x!=0){flag=0;break;}
            }
            if(flag==1){
                for(int x : b ){
                    if(x%num!=0){flag=0;break;}
                }
            }
            if(flag==1)count++;
        }
        
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
