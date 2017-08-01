//Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] charCount = new int[26];
        int result=0;
        for(int i : charCount)i=0;
        for(char c : first.toCharArray())charCount[c-'a']++;
        for(char c : second.toCharArray())charCount[c-'a']--;
        for(int i : charCount)result+=java.lang.Math.abs(i);
        return result;
      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
