//Warmup-1 > posNeg 
public boolean posNeg(int a, int b, boolean negative) {
  if(negative){
    return ( a < 0 && b < 0);
  }else{
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}

//Warmup-1 > notString
public String notString(String str) {
  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
    return str;
  }else{
    return "not " + str;
  }
}

//Warmup-1 > missingChar 
public String missingChar(String str, int n) {
  return str.substring(0, n) + str.substring(n+1, str.length());
}

//Warmup-1 > frontBack 
public String frontBack(String str) {
  if(str.length()<2) return str;
  
  String first="";
  String mid=""; 
  String last="";
  
  last = str.substring(0,1);
  mid = str.substring(1, str.length()-1);
  first = str.substring(str.length()-1);
  
  return first + mid + last;
}

//Warmup-1 > front3 
public String front3(String str) {
  int len = str.length();
  String temp = "";
  if(len >= 3){
    temp = str.substring(0, 3);
  }else{
    temp = str;
  }
  return temp + temp + temp;
}

//Warmup-1 > backAround
public String backAround(String str) {
  String temp="";
  int len = str.length();
  if(len == 0) return str;
  temp = str.substring(len-1);
  return temp + str + temp;
}

//Warmup-1 > or35 
public boolean or35(int n) {
  return (n % 3 == 0) || (n % 5 == 0);
}

//Warmup-1 > front22 
public String front22(String str) {
  int len = str.length();
  String temp = "";
  if(len == 0) return str;
  if(len >= 2){
    temp = str.substring(0, 2);
  }else{
    temp = str.substring(0, 1);
  }  
  return temp + str + temp;
}

//Warmup-1 > startHi 
public boolean startHi(String str) {
  if(str.length() < 2) return false;
  if(str.substring(0, 2).equals("hi")) return true;
  return false;
}

//Warmup-1 > icyHot 
public boolean icyHot(int temp1, int temp2) {
  return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
}

//Warmup-1 > in1020
public boolean in1020(int a, int b) {
  return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
}

//Warmup-1 > hasTeen 
public boolean hasTeen(int a, int b, int c) {
  return (a>=13 && a<=19) || (b>=13 && b<=19) | (c>=13 && c<=19);
}

//Warmup-1 > loneTeen 
public boolean loneTeen(int a, int b) {
  if ((a >= 13 && a <= 19) && (b >= 13 && b <=19)) {
    return false;
  }
  return ((a >= 13 && a <= 19) || (b >= 13 && b <=19));
}

//Warmup-1 > delDel 
public String delDel(String str) {
  if (str.length() <= 3)  return str;
  
  if(str.substring(1,4).equals("del")) {
    StringBuilder sb = new StringBuilder(str);
    sb.replace(1,4,"");

    return sb.toString();
  }
  return str;  
}

//Warmup-1 > mixStart
public boolean mixStart(String str) {
  if(str.length() < 3) return false;
  return str.substring(1, 3).equals("ix");
}

//Warmup-1 > startOz 
public String startOz(String str) {
  String temp = "";
  int len = str.length();
  if(len >= 1 && str.charAt(0) == 'o') temp += str.charAt(0);
  if(len >= 2 && str.charAt(1) == 'z') temp += str.charAt(1);
  return temp;
}

//Warmup-1 > intMax
public int intMax(int a, int b, int c) {
  int max = a;
  if(b > max) max = b;
  if(c > max) max = c;
  return max;
}

//Warmup-1 > close10
public int close10(int a, int b) {
  int tempa;
  int tempb;
  tempa = Math.abs(10 - a);
  tempb = Math.abs(10 - b);
  if(tempa < tempb) return a;
  if(tempa > tempb) return b;
  return 0;
}

//Warmup-1 > in3050 
public boolean in3050(int a, int b) {
  if(a >= 30 && a <= 40 && b >= 30 && b <= 40){ 
    return true;
  }else if(a >= 40 && a <= 50 && b >= 40 && b <= 50){
    return true;
  }
  return false;
}

//Warmup-1 > max1020
public int max1020(int a, int b) {
  int max=0;
  int min=0;
  if(a > b){ max=a; min=b;}
  if(b > a){ max=b; min=a;}
  if(max >= 10 && max <= 20) return max;
  if(min >= 10 && min <= 20) return min;
  return 0;
}

//Warmup-1 > stringE
public boolean stringE(String str) {
 int count = 0;
 for(int i = 0; i < str.length(); i++){
   if(str.substring(i, i+1).equals("e")) count += 1;
 }
 return (count >= 1 && count <= 3);
}

//Warmup-1 > lastDigit
public boolean lastDigit(int a, int b) {
  return (a % 10 == b % 10);
}

//Warmup-1 > endUp 
public String endUp(String str) {
  int len = str.length();
  if(len >= 3){
    return str.substring(0, len-3) + str.substring(len-3).toUpperCase();
  }else{
    return str.toUpperCase();
  }
}

//Warmup-1 > everyNth 
public String everyNth(String str, int n) {
  String temp = "";
  for(int i=0; i<str.length(); i+=n){
    temp += str.substring(i, i+1);
  }
  return temp;
}

