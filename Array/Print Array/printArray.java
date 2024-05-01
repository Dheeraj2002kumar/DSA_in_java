
public class printArray {
  public void PrintArrayElement(int[] arr){
    int n = arr.length;
    for (int i = 0; i < n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args){
    printArray arrUtil = new printArray();
    arrUtil.PrintArrayElement(new int[] {5, 1, 2, 9, 10});
  }
}