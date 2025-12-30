public class FindUniqueUsingXOR {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 2, 1};
    System.out.println("Unique element: " + findUnique(arr));
  }

  public static int findUnique(int[] arr) {
    int result = 0;
    for (int num : arr) {
      result ^= num;
    }
    return result;
  }
}