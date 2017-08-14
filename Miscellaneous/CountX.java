/*Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.*/

public int countX(String str) {
  if(str.length()==0)return 0;
  if(str.length()==1)if(str.equals("x"))return 1;else return 0;
  else if(str.substring(str.length()-1,str.length()).equals("x"))return 1+countX(str.substring(0,str.length()-1));
  else return countX(str.substring(0,str.length()-1));
}
