# DSA_in_java

 * <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/TimeComplexity/TimeComplexity.java"> Time Complexity </a>
* <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/Adding%20or%20Updating%20elements%20in%20an%20Array/ArrayUtil.java"> Adding and Update Element</a>
* <h3>Remove Even Integers From an Array</h3>
<pre>Q. Give an array of integers, return an array with even integers removed.
Example –
	Input: arr = {3, 2, 4, 7, 10 , 6, 5}
	Output: arr = {3, 7, 5}
--> <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/Remove%20Even%20Integer/removeEvenInteger.java"> Remove Even Integers From an Array</a>
</pre>
<h4>How to reverse an array in java</h4>
<pre>
	Q. Give an array or string, the task is to reverse the array or string. 
Example-
    Given array of integers – { 2, 11, 5, 10, 7, 8}

Solution – 
    Return reverse of array – {8, 7, 10, 5, 11,2}

Algorithm-
reverseArray(int numbers[], int start, int end){
   while(start<end){
       int temp = numbers[start];
       numbers[start]=numbers[end];
       numbers[end]=temp;
       start++;
       end--;
     }
}

reverseArray(numbers, 0, numbers.length – 1)

</pre>
<a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/Array/ReverseArray/ReverseArray.java">Reverse Array</a>

<h4>Find Minimum value in array</h4>
<pre> 
Algorithm-
	
Public int findMinimum(int[] arr){
     int min = arr[0];
     for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
               min=arr[i];
           }
      }
     Return min;
} 

</pre>
