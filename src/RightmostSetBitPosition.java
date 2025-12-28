public class RightmostSetBitPosition {
  /**
   * Find the position of the rightmost set bit in a number
   * @param n the input number
   * @return position of rightmost set bit (1-indexed), or 0 if no set bit
   */
  public static int findRightmostSetBitPosition(int n) {
    if (n == 0) {
      return 0;
    }
    
    int position = 1;
    while ((n & 1) == 0) {
      n >>= 1;
      position++;
    }
    return position;
  }
  
  /**
   * Alternative approach using bit manipulation trick
   */
  public static int findRightmostSetBitPositionOptimized(int n) {
    if (n == 0) {
      return 0;
    }
    return Integer.numberOfTrailingZeros(n) + 1;
  }
  
  public static void main(String[] args) {
    int[] testCases = {12, 18, 5, 32, 1, 0};
    
    for (int num : testCases) {
      System.out.println("Number: " + num + " -> Rightmost set bit position: " 
        + findRightmostSetBitPosition(num));
    }
  }
}