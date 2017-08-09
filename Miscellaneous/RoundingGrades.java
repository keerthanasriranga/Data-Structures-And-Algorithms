/*if the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of .
If the value of grade is less than 38 , no rounding occurs as the result will still be a failing grade.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RoundingGrades {

    static int[] solve(int[] grades){
        // Complete this function
        int finalGrades[]=new int[grades.length];
        int i=0;
        for(int grade : grades){
            if(grade<38){
                finalGrades[i]=grade;
            }
            else
            {
               if(grade%5>2)finalGrades[i]=(grade-grade%5)+5;
                else finalGrades[i]=grades[i];
            }
            i++;
        }
        return finalGrades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
