public class ClearIthBit {
  public static int clearBit(int num, int i) {
    // Create a mask with all 1s except at position i
    int mask = ~(1 << i);
    // AND the number with the mask to clear the ith bit
    return num & mask;
  }

  public static void main(String[] args) {
    int num = 15; // Binary: 1111
    int i = 2;    // Clear bit at position 2
    
    System.out.println("Original number: " + num + " (" + Integer.toBinaryString(num) + ")");
    System.out.println("After clearing bit at position " + i + ": " + clearBit(num, i) 
              + " (" + Integer.toBinaryString(clearBit(num, i)) + ")");
  }
}