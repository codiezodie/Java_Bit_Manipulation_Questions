// Using n & 1 to determine even or odd

public class EvenOddBit {
  public static void main(String[] args) {
    int number = 15;
    
    if (isEven(number)) {
      System.out.println(number + " is even");
    } else {
      System.out.println(number + " is odd");
    }
  }
  
  // Method to check if a number is even using bitwise AND
  public static boolean isEven(int num) {
    return (num & 1) == 0;
  }
  
  // Method to check if a number is odd using bitwise AND
  public static boolean isOdd(int num) {
    return (num & 1) == 1;
  }
}