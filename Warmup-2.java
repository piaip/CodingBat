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

//Warmup-2 > last2 
public int last2(String str) {
  int len = str.length();
  int count = 0;
  String last = "";
  if(len < 2) return 0;
  last = str.substring(len-2, len);
  for(int i=0; i<len-2; i++){
    if(str.substring(i, i+2).equals(last)) count += 1;
  }
  return count;
}

//Warmup-2 > arrayCount9 
public int arrayCount9(int[] nums) {
  int count = 0;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 9) count += 1;
  }
  return count;
}

//Warmup-2 > arrayFront9
public boolean arrayFront9(int[] nums) {
  int len = nums.length;
  for(int i=0; i<len; i++){
    if(i >= 4) return false;
    if(nums[i] == 9) return true;
  }
  return false;
}

//Warmup-2 > array123
public boolean array123(int[] nums) {
  int len = nums.length;
  if(len < 3) return false;
  for(int i=0; i<nums.length-2; i++){
    if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
  }
  return false;
}

//Warmup-2 > stringMatch
public int stringMatch(String a, String b) {
    int min = Math.min(a.length(), b.length());
    int count = 0;
    
    for(int i=0; i<min-1; i++){
      if(a.substring(i, i+2).equals(b.substring(i, i+2))) count += 1;
    }
    return count;
}

//Warmup-2 > stringX 
public String stringX(String str) {
  int len = str.length();
  
  if(len < 2) return str;
  
  int midlen = 0;
  String temp = "";
  String first = str.substring(0, 1);
  String last = str.substring(len-1);
  String mid = str.substring(1, len-1);
  for(int i=0; i<mid.length(); i++){
    if(!mid.substring(i, i+1).equals("x")) temp += mid.substring(i, i+1);
  }
  return first + temp + last;
}

//Warmup-2 > altPairs 
public String altPairs(String str) {
  String temp = "";
  int len = str.length();
  //if(len <= 2) return str;
  for(int i=0; i<len; i+=4){
    temp += str.substring(i, Math.min(len, i + 2));
  }
  return temp;
}

//Warmup-2 > stringYak 
public String stringYak(String str) {
  str = str.replace("yak", "");
  return str;
}

//Warmup-2 > array667
public int array667(int[] nums) {
  int count = 0;
  for(int i=0; i<nums.length-1; i++){
    if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) count += 1;
  }
  return count;
}

//Warmup-2 > noTriples
public boolean noTriples(int[] nums) {
  for(int i=0; i<nums.length-2; i++){
    if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) return false;
  }
  return true;
}

//Warmup-2 > has271
public boolean has271(int[] nums) {
  for(int i=0; i<nums.length-2; i++){
    if(nums[i+1]-nums[i] == 5){
      if(Math.abs(nums[i+2]-(nums[i]-1)) <=2){
        return true;
      }
    }
  }
  return false;  
}
