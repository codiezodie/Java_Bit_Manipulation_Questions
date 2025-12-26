public class ToggleIthBit {
  
  /**
   * Toggles the ith bit of a number
   * @param num the number
   * @param i the bit position (0-indexed from right)
   * @return the number with the ith bit toggled
   */
  public static int toggleIthBit(int num, int i) {
    return num ^ (1 << i);
  }
  
  public static void main(String[] args) {
    int num = 5;  // Binary: 101
    int position = 1;  // Toggle bit at position 1
    
    System.out.println("Original number: " + num + " (Binary: " + Integer.toBinaryString(num) + ")");
    
    int result = toggleIthBit(num, position);
    
    System.out.println("After toggling bit at position " + position + ": " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
  }
}