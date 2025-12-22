public class CountSetBits {
  
  /**
   * Count the number of set bits (1s) in an integer
   * @param n the integer to check
   * @return the count of set bits
   */
  public static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
      count += n & 1;  // Check if the last bit is 1
      n >>= 1;         // Right shift by 1
    }
    return count;
  }
  
  /**
   * Alternative approach using Brian Kernighan's algorithm
   * More efficient as it only iterates for set bits
   */
  public static int countSetBitsOptimized(int n) {
    int count = 0;
    while (n > 0) {
      n &= n - 1;  // Removes the rightmost set bit
      count++;
    }
    return count;
  }
  
  public static void main(String[] args) {
    int num = 13;  // Binary: 1101 (3 set bits)
    
    System.out.println("Number: " + num);
    System.out.println("Set bits (Method 1): " + countSetBits(num));
    System.out.println("Set bits (Method 2): " + countSetBitsOptimized(num));
    System.out.println("Using built-in: " + Integer.bitCount(num));
  }
}