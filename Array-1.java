//Array-1 > firstLast6
public boolean firstLast6(int[] nums) {
  int len = nums.length;
    return (len >= 1 && (nums[0] == 6 || nums[len-1] == 6));
}

//Array-1 > sameFirstLast
public boolean sameFirstLast(int[] nums) {
  int len = nums.length;
  return (len >= 1 && nums[0] == nums[len-1]);
}

//Array-1 > makePi 
public int[] makePi() {
  int [] pie = {3, 1, 4};
  return pie;
} 

//Array-1 > commonEnd
public boolean commonEnd(int[] a, int[] b) {
  return a[0] == b[0] || a[a.length-1] == b[b.length-1];
}

//Array-1 > sum3
public int sum3(int[] nums) {
  int sum = 0;
  for(int i = 0; i < nums.length; i++){
    sum += nums[i];
  }
  return sum;
}

//Array-1 > rotateLeft3
public int[] rotateLeft3(int[] nums) {
  return new int[] {nums[1], nums[2], nums[0]};
}

//Array-1 > reverse3
public int[] reverse3(int[] nums) {
  return new int[] {nums[2], nums[1], nums[0]};
}

//Array-1 > maxEnd3
public int[] maxEnd3(int[] nums) {
  int max = 0;
  for(int i = 0; i < nums.length; i++){
    if((i==0 || i==nums.length-1) && max < nums[i]) max = nums[i];
  }
  return new int[] {max, max, max};
}

//Array-1 > sum2
public int sum2(int[] nums) {
  int len = nums.length;
  if(len == 0) return 0;
  if(len == 1) return nums[0]; 
  return nums[0] + nums[1]; 
}

//Array-1 > middleWay
public int[] middleWay(int[] a, int[] b) {
  return new int[] {a[1], b[1]};
}

//Array-1 > makeEnds
public int[] makeEnds(int[] nums) {
  return new int[] {nums[0], nums[nums.length-1]};
}

//Array-1 > has23
public boolean has23(int[] nums) {
  return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
}

//Array-1 > no23
public boolean no23(int[] nums) {
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 2 || nums[i] == 3) return false;
  }
  return true;
}

//Array-1 > makeLast
public int[] makeLast(int[] nums) {
  int len = nums.length;
  int last = nums[len-1];
  int[] myarr = new int[2 * len]; 
  myarr[myarr.length-1] = last;
  return myarr;
}

//Array-1 > double23 
public boolean double23(int[] nums) {
  int len = nums.length;
  if(len == 0 || len == 1) return false;
  if(len >= 2 && (nums[0] == 2 || nums[0] == 3) && nums[0] == nums[1])
    return true;
  return false;  
}

//Array-1 > fix23
public int[] fix23(int[] nums) {
  for(int i=0; i<nums.length-1; i++){
    if(nums[i] == 2 && nums[i+1] == 3) nums[i+1] = 0;
  }
  return nums;
}

//Array-1 > start1
public int start1(int[] a, int[] b) {
  int count = 0;
  if(a.length > 0 && a[0] == 1) count += 1;
  if(b.length > 0 && b[0] == 1) count += 1;
  return count;
}

//Array-1 > biggerTwo 
public int[] biggerTwo(int[] a, int[] b) {
  int counta = 0;
  int countb = 0;
  counta = a[0] + a[1];
  countb = b[0] + b[1];
  if(countb > counta) return b;
  return a;
}

//Array-1 > makeMiddle 
public int[] makeMiddle(int[] nums) { 
  int mid = nums.length / 2;
  return new int[] {nums[mid-1], nums[mid]};
}

//Array-1 > plusTwo
public int[] plusTwo(int[] a, int[] b) {
  return new int[] {a[0], a[1], b[0], b[1]};
}

//Array-1 > swapEnds 
public int[] swapEnds(int[] nums) {
  int temp = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = temp;
  return nums;
}

//Array-1 > midThree 
public int[] midThree(int[] nums) {
  int n = nums.length / 2;
  return new int[] {nums[n-1], nums[n], nums[n+1]}; 
}

//Array-1 > maxTriple
public int maxTriple(int[] nums) {
  int max = 0;
  int len = nums.length;
  int mid = len / 2;
  if(len >= 1){ 
    max = nums[0];
    if(nums[len-1] > max) max = nums[len-1]; 
    if(nums[mid] > max)   max = nums[mid];   
  }
  return max;
}

//Array-1 > frontPiece
public int[] frontPiece(int[] nums) {
  if(nums.length <= 2) return nums;
  return new int[] {nums[0], nums[1]};
}

//Array-1 > unlucky1
public boolean unlucky1(int[] nums) {
  int len = nums.length;
  if(len >= 2){
    if(nums[0] == 1 && nums[1] == 3) return true;
    if(nums[len-2] == 1 && nums[len-1] == 3) return true;
    if(len > 2 && nums[1] == 1 && nums[2] == 3) return true;
  }
  return false;
}

//Array-1 > make2
public int[] make2(int[] a, int[] b) { 
  int[] myarr = new int[2];
  int count = 0;
  int i = 0;
  while(i < a.length && count < 2){
    myarr[count] = a[i]; 
    i++; count++;
  }
  i = 0;
  while(i < b.length && count < 2){
    myarr[count] = b[i]; 
    i++; count++;
  }
  return myarr;
}

//Array-1 > front11 
public int[] front11(int[] a, int[] b) {
  if(a.length == 0 && b.length == 0)  return a;
  if(a.length == 0 && b.length > 0)   return new int[] {b[0]}; 
  if(a.length > 0 && b.length == 0)   return new int[] {a[0]};
  return new int[] {a[0], b[0]};
}

