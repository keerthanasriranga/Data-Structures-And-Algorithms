import java.io.*;
import java.util.*;

public class EulersGCD {
    public static int GCD(int x, int y){
        if(x==y)return x;
        else if(x>y) return GCD(x-y,y);
        else return GCD(y-x,x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
    }
}
