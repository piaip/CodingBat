//Warmup-2 > stringTimes 
public String stringTimes(String str, int n) {
 String temp = "";
 int i=0;
 for(i=0; i<n; i++){
   temp += str;
 }
 return temp;
}

//Warmup-2 > countXX 
int countXX(String str) {
  int count = 0;
  for(int i=0; i<str.length()-1; i++){
    if(str.substring(i, i+2).equals("xx")) count += 1;
  }
  return count;
}

//Warmup-2 > doubleX
boolean doubleX(String str) {
  int index = str.indexOf("x");
  if(index == -1) return false;
  if(str.length() > index+1 && str.substring(index, index+2).equals("xx")) return true;
  return false;
}

//Warmup-2 > stringBits 
public String stringBits(String str) {
  String temp = "";
  for(int i=0; i<str.length(); i+=2){
    temp += str.charAt(i);
  }
  return temp;
}

//Warmup-2 > stringSplosion
public String stringSplosion(String str) {
  String temp = "";
  for(int i=0; i<str.length(); i++){
   temp += str.substring(0, i); 
  }
  return temp + str;
}

