//String-1 > helloName
public String helloName(String name) {
  return "Hello " + name + "!";
}

//String-1 > makeAbba
public String makeAbba(String a, String b) {
  return a + b + b + a;
}

//String-1 > makeTags
public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}

//String-1 > makeOutWord 
public String makeOutWord(String out, String word) {
  int len = out.length();
  return out.substring(0,2) + word + out.substring(len-2, len);
}

//String-1 > extraEnd
public String extraEnd(String str) {
  int len = str.length();
  if(len < 2) return str;
  String temp = str.substring(len-2, len);
  return temp + temp + temp;
}

//String-1 > firstTwo
public String firstTwo(String str) {
  if(str.length() < 2) return str;
  return str.substring(0, 2);
}

//String-1 > firstHalf 
public String firstHalf(String str) {
  int half = str.length() / 2;
  return str.substring(0, half);
}

//String-1 > withoutEnd
public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}

//String-1 > comboString
public String comboString(String a, String b) {
  int lena = a.length();
  int lenb = b.length();
  if(lena > lenb){ 
    return b + a + b;
  }else{
    return a + b + a;
  }
}

//String-1 > nonStart
public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}

//String-1 > left2
public String left2(String str) {
  if(str.length() < 2) return str;
  return str.substring(2) + str.substring(0,2);
}

//String-1 > right2
public String right2(String str) {
  int len = str.length();
  if(len < 2) return str;
  return str.substring(len-2, len) + str.substring(0, len-2);
}

//String-1 > theEnd
public String theEnd(String str, boolean front) {
  if(str.length() < 1) return str;
  if(front){
    return str.substring(0,1);
  }else{
    return str.substring(str.length()-1);
  }
}

//String-1 > withouEnd2
public String withouEnd2(String str) {
  int len = str.length();
  if(len <= 2) return "";
  return str.substring(1, len-1);
}

//String-1 > middleTwo
public String middleTwo(String str) {
  int i = str.length() / 2;
  return str.substring(i-1, i+1);
}

//String-1 > endsLy 
public boolean endsLy(String str) {
  int len = str.length();
  if(len < 2) return false;
  if(str.substring(len-2).equals("ly")) return true;
  return false;
}

//String-1 > nTwice
public String nTwice(String str, int n) {
  int len = str.length();
  return str.substring(0, n) + str.substring(len-n, len);
}

//String-1 > twoChar 
public String twoChar(String str, int index) {
  if(str.length() < index+2 || index < 0) return str.substring(0,2);
  return str.substring(index, index+2);
}

//String-1 > middleThree
public String middleThree(String str) {
  int i = str.length() / 2;
  return str.substring(i-1, i+2);
}

//String-1 > hasBad 
public boolean hasBad(String str) {
  int len = str.length();
  if(len >= 3) {
    if(str.substring(0,3).equals("bad")) return true;
  }
  if(len >= 4 ){
    if(str.substring(1,4).equals("bad")) return true;
  }
  return false;

 //String-1 > atFirst
 public String atFirst(String str) {
  String temp = "";
  int len = str.length();
  if(len >= 2) temp = str.substring(0,2);
  if(len == 0) temp = "@@";
  if(len == 1) temp = str + "@";
  return temp;
}
  
//String-1 > lastChars 
public String lastChars(String a, String b) {
  int lena = a.length();
  int lenb = b.length();
  String tempa = "@";
  String tempb = "@";
  if(lena != 0) tempa = a.substring(0, 1);
  if(lenb != 0) tempb = b.substring(lenb - 1);
  return tempa + tempb;
}
  
 //String-1 > conCat 
 public String conCat(String a, String b) {
  int lena = a.length();
  if(lena > 0 && b.length() > 0 && a.substring(lena-1).equals(b.substring(0, 1)))
    return a.substring(0, lena-1) + b;
  return a + b;  
}
  
//String-1 > lastTwo
public String lastTwo(String str) {
  int len = str.length();
  if(len < 2) return str;
  String temp = "";
  if(len > 2) temp = str.substring(0, len-2);
  return temp + str.charAt(len-1) + str.charAt(len-2);
}

//String-1 > seeColor 
public String seeColor(String str) {
  int len = str.length();
  if(len >= 3 && str.substring(0,3).equals("red")) return "red";
  if(len >= 4 && str.substring(0,4).equals("blue")) return "blue";
  return "";
}
  
//String-1 > frontAgain
public boolean frontAgain(String str) {
  int len = str.length();
  if(len >= 2){
    if(str.substring(0, 2).equals(str.substring(len-2))) return true;
  }
  return false;
}
  
//String-1 > minCat 
public String minCat(String a, String b) {
  int lena = a.length();
  int lenb = b.length();
  if(lena == 0 || lenb == 0) return "";
  if(lena >= lenb) return a.substring(lena-lenb) + b;
  if(lenb > lena) return a + b.substring(lenb-lena);
  return a + b;
}
  
//String-1 > extraFront 
public String extraFront(String str) {
  if(str.length() >= 2){
    return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
  }else{
    return str.substring(0) + str.substring(0) + str.substring(0);
  }
}
  
//String-1 > without2
public String without2(String str) {
  int len = str.length(); 
  if(len >= 2 && str.substring(0,2).equals(str.substring(len-2))) 
    return str.substring(2);
  return str;
}

//String-1 > deFront 
public String deFront(String str) {    
  String temp = "";
  int len = str.length();
  if(len >= 1 && str.substring(0,1).equals("a")) temp += "a";
  if(len >= 2 && str.substring(1,2).equals("b")) temp += "b";  
  if(len > 2) temp += str.substring(2);
  return temp;
}

//String-1 > startWord 
public String startWord(String str, String word) {
    if(str.length() >= word.length() && 
      str.substring(1, word.length()).equals(word.substring(1)))
        return str.substring(0, word.length());
    return "";
}
  
  
