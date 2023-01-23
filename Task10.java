package Project1;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        //10)Write a java program to find the second largest number in the array?

        // created 2 variables
        int largest=0;
        int secondLargest=0;
        int arr []={100,88,63,14,2,7,56};
for( int i=0; i< arr.length;i++){
    if(arr[i]>largest) {
        secondLargest = largest;
        largest = arr[i];
    }else if (arr[i]>secondLargest){
    secondLargest=arr[i];
    }}

        System.out.println(Arrays.toString(arr));
        System.out.println("The 2nd Largest number is: "+ secondLargest);
    }}

        /*
       int size= numbers.length;
        Arrays.sort(numbers);
        System.out.println("Secend Highest number is "+ numbers[size-2]);



 */

