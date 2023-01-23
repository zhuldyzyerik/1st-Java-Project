package Project1;

import javax.swing.*;

public class Task5 {
    public static void main(String[] args) {
  //5)Create a 2D array of integers
        // Develop a program which will calculate the sum of  even and odd numbers for that array.

        int numbers [][]= {{1,12,5,8,7},
                          {2,8,41,3},
                          {6,9,40,4}};
        int sumOdd=0;
        int sumEven=0;
        for(int i=0; i< numbers.length;i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    sumEven += numbers[i][j];
                } else {
                    sumOdd += numbers[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers is: "+ sumEven);
        System.out.println("Sum of odd numbers is: "+ sumOdd);


    }
}
