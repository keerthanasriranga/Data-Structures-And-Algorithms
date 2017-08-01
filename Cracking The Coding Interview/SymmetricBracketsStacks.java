//Problem statement: Checks if input bracket string is symmetric or not

//Sloppy solution by me
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SymmetricBracketsStacks {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> expStack = new Stack<Character>();
        for(char c : expression.toCharArray()){
            if(c=='{'||c=='['||c=='(')expStack.push(c);
            else {
                if(!expStack.empty()){
                if((c=='}'&&expStack.peek()=='{')||(c==']'&&expStack.peek()=='[')||                                                                     (c==')'&&expStack.peek()=='('))
                    expStack.pop();
                    else return false;
                }
                else return false;
            }
        }
        if(expStack.empty())return true;
        else return false;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

//Better solution:
/*
public static boolean isBalanced(String expression) {

// Must be even
if ((expression.length() & 1) == 1) return false;
else {
  char[] brackets = expression.toCharArray();
  Stack<Character> s = new Stack<>();
  for (char bracket : brackets)
    switch (bracket) {
      case '{': s.push('}'); break;
      case '(': s.push(')'); break;
      case '[': s.push(']'); break;
      default :
        if (s.empty() || bracket != s.peek())
          return false;
        s.pop();
    }
  return s.empty();
}

}
*/
