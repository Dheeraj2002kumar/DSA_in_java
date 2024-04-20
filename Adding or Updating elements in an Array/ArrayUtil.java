import java.net.SocketTimeoutException;

import javax.sound.midi.Soundbank;

public class ArrayUtil {
    
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArray = new int[5];  // default values
       // printArray(myArray);
       myArray[0] = 5; 
       myArray[1] = 1;
       myArray[2] = 3;
       myArray[3] = 2;
       myArray[4] = 10;
       
       // i want to update the index value
       myArray[2] = 7;

       printArray(myArray);

       // if i give exces value of the index the what will be give the error
    //    myArray[5] = 15;

    // check length of the array
    System.out.println(myArray.length);

    // get last index of the array
    System.out.println(myArray[myArray.length - 1]);

    // let's give other array
    int[] arr = {5,1,8,10};
    printArray(arr);

    }

    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
    }
}
