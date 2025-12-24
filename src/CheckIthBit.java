public class CheckIthBit {
  
  /**
   * Check if the ith bit of a number is set (1)
   * @param num the number to check
   * @param i the bit position (0-indexed from right)
   * @return true if ith bit is set, false otherwise
   */
  public static boolean isIthBitSet(int num, int i) {
    return ((num >> i) & 1) == 1;
  }
  
  /**
   * Alternative method using bit mask
   */
  public static boolean isIthBitSetAlt(int num, int i) {
    return (num & (1 << i)) != 0;
  }
  
  public static void main(String[] args) {
    int number = 5; // Binary: 101
    
    System.out.println("Number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
    
    for (int i = 0; i < 4; i++) {
      System.out.println("Bit at position " + i + ": " + isIthBitSet(number, i));
    }
  }
}