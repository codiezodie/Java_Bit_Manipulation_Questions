public class TurnOffRightmostSetBit {
  
  /**
   * Turn off the rightmost set bit of a number
   * @param n the input number
   * @return number with rightmost set bit turned off
   */
  public static int turnOffRightmostSetBit(int n) {
    return n & (n - 1);
  }
  
  public static void main(String[] args) {
    int num1 = 12;  // Binary: 1100
    int num2 = 8;   // Binary: 1000
    int num3 = 7;   // Binary: 0111
    
    System.out.println(num1 + " -> " + turnOffRightmostSetBit(num1));  // 1100 -> 1000 (12 -> 8)
    System.out.println(num2 + " -> " + turnOffRightmostSetBit(num2));  // 1000 -> 0000 (8 -> 0)
    System.out.println(num3 + " -> " + turnOffRightmostSetBit(num3));  // 0111 -> 0110 (7 -> 6)
  }
}