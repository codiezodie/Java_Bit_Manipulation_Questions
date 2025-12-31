public class MostSignificantBit {
  
  public static int findMostSignificantBit(int num) {
    if (num == 0) {
      return 0;
    }
    
    int msb = 0;
    while (num > 0) {
      msb = num;
      num >>= 1;
    }
    
    return msb;
  }
  
  public static void main(String[] args) {
    int[] testNumbers = {12, 128, 255, 1, 0};
    
    for (int num : testNumbers) {
      System.out.println("MSB of " + num + " is: " + findMostSignificantBit(num));
    }
  }
}