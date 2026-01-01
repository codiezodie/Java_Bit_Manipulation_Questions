public class PowerOfFour {
  public static boolean isPowerOfFour(int n) {
    if (n <= 0) {
      return false;
    }
    
    // Check if n is a power of 2
    if ((n & (n - 1)) != 0) {
      return false;
    }
    
    // Check if n is a power of 4
    // Powers of 4: 1 (0x1), 4 (0x4), 16 (0x10), 64 (0x40), 256 (0x100), ...
    // In binary, powers of 4 have the set bit at even positions (0, 2, 4, 6, ...)
    // 0x55555555 = 01010101010101010101010101010101 (mask for even bit positions)
    return (n & 0x55555555) != 0;
  }
  
  public static void main(String[] args) {
    System.out.println(isPowerOfFour(1));    // true
    System.out.println(isPowerOfFour(4));    // true
    System.out.println(isPowerOfFour(16));   // true
    System.out.println(isPowerOfFour(64));   // true
    System.out.println(isPowerOfFour(5));    // false
    System.out.println(isPowerOfFour(8));    // false
  }
}