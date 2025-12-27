public class OddEvenUsingXOR {
  
  public static void main(String[] args) {
    checkOddEven(5);
    checkOddEven(8);
    checkOddEven(0);
  }
  
  public static void checkOddEven(int num) {
    // XOR with 1: if result is 1, number is odd; if 0, number is even
    if ((num ^ 1) == num + 1) {
      System.out.println(num + " is even");
    } else {
      System.out.println(num + " is odd");
    }
  }
}