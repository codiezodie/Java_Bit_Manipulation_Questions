public class PowerOfTwo {
  
  /**
   * Checks if a number is a power of two using bit manipulation.
   * A number is a power of two if it has only one bit set to 1.
   * 
   * @param n the number to check
   * @return true if n is a power of two, false otherwise
   */
  public static boolean isPowerOfTwo(int n) {
    // A power of two must be positive and have only one bit set
    return n > 0 && (n & (n - 1)) == 0;
  }
  
  public static void main(String[] args) {
    int[] testNumbers = {1, 2, 3, 4, 5, 8, 16, 32, 64, 100, 128, 256};
    
    for (int num : testNumbers) {
      System.out.println(num + " is power of two: " + isPowerOfTwo(num));
    }
  }
}