public class SingleNonRepeating {
  public static int findSingleNonRepeating(int[] arr) {
    int result = 0;
    for (int num : arr) {
      result ^= num;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {4, 2, 7, 2, 4};
    System.out.println("Single non-repeating element: " + findSingleNonRepeating(arr));
  }
}