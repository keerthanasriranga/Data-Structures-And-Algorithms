import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MyQueue<T>{
    Stack<T> oldValueOnTop = new Stack<T>();
    Stack<T> newValueOnTop = new Stack<T>();
   public void enqueue(T value) { // Push onto newest stack
            newValueOnTop.push(value);
        }

        public T peek() {
             prepOld();
             return oldValueOnTop.peek();
        }

        public T dequeue() {
            
            prepOld();
            return oldValueOnTop.pop();
            
        }
        
        public void prepOld(){
            if (oldValueOnTop.isEmpty())
                while(!newValueOnTop.isEmpty())
                    oldValueOnTop.push(newValueOnTop.pop());
        }
    
}


public class Solution {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
