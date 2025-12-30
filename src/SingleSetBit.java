public class SingleSetBit {
  
  /**
   * Checks if a number has exactly one set bit.
   * A number has exactly one set bit if it's a power of 2.
   * 
   * @param n the number to check
   * @return true if n has exactly one set bit, false otherwise
   */
  public static boolean hasSingleSetBit(int n) {
    // A number with single set bit satisfies: n > 0 && (n & (n - 1)) == 0
    return n > 0 && (n & (n - 1)) == 0;
  }
  
  public static void main(String[] args) {
    // Test cases
    int[] testNumbers = {1, 2, 4, 8, 16, 3, 5, 7, 15, 32, 64};
    
    for (int num : testNumbers) {
      System.out.println(num + " has single set bit: " + hasSingleSetBit(num));
    }
  }
}