//Problem Statement :
//A kidnapper wrote a ransom note but is worried it will be traced back to him. 
//He found a magazine and wants to know if he can cut out whole words from it and use them 
//to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use
//whole words available in the magazine,
//meaning he cannot use substrings or concatenation to create the words he needs.
//Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note 
//exactly using whole words from the magazine; otherwise, print No.
// Not the most effecient way, I know ! But finally, at least I could implement all by myself! :)

import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    String magazineWords[];
    String noteWords[];
    public Solution(String magazine, String note) {
        magazineMap = new HashMap();
        noteMap = new HashMap();
        magazineWords = magazine.split(" ");
        noteWords = note.split(" ");
        for(String s : magazineWords){
            if(magazineMap.containsKey(s)){
                int value = magazineMap.get(s);
                value++;
                magazineMap.remove(s);
                magazineMap.put(s,value);
            }
            else
            {
                magazineMap.put(s,0);
            }
        }
        for(String s : noteWords){
            if(noteMap.containsKey(s)){
                int value = noteMap.get(s);
                value++;
                noteMap.remove(s);
                noteMap.put(s,value);
            }
            else
            {
                noteMap.put(s,0);
            }
        }
        
        
    }
    
    public boolean solve() {
       
        for(String s : noteWords){
            if(magazineMap.containsKey(s)){
                if(magazineMap.get(s)<noteMap.get(s)){
                    return false;
                  
                }
                
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
