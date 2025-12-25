public class XorFromOneToN {
  
  /**
   * Find XOR of all numbers from 1 to N using pattern
   * Pattern: XOR result repeats every 4 numbers
   * n % 4 == 1: result = 1
   * n % 4 == 2: result = n + 1
   * n % 4 == 3: result = 0
   * n % 4 == 0: result = n
   */
  public static int xorFromOneToN(int n) {
    int remainder = n % 4;
    
    switch (remainder) {
      case 0:
        return n;
      case 1:
        return 1;
      case 2:
        return n + 1;
      case 3:
        return 0;
      default:
        return 0;
    }
  }
  
  public static void main(String[] args) {
    // Test cases
    System.out.println("XOR from 1 to 4: " + xorFromOneToN(4));    // Output: 4
    System.out.println("XOR from 1 to 5: " + xorFromOneToN(5));    // Output: 1
    System.out.println("XOR from 1 to 6: " + xorFromOneToN(6));    // Output: 7
    System.out.println("XOR from 1 to 7: " + xorFromOneToN(7));    // Output: 0
    System.out.println("XOR from 1 to 10: " + xorFromOneToN(10));  // Output: 10
  }
}