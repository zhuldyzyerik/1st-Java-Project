package Project1;

import java.util.SortedMap;

public class Task8 {
    public static void main(String[] args) {
//  8)Write a Java Program to print the first 10 numbers of Fibonacci series.
// Output: 0 1 1 2 3 5 8 13 21 34
int number1=0;
int number2=1;
int count=10;
int number3;
int i;
        System.out.print(number1+" " +number2); //printing 0 and 1
for (i=2; i<count;i++){ //loop starts from 2 because 0 and 1 are already printed
   number3=number1+number2;
    System.out.print(" "+number3);
    number1=number2;
    number2=number3;}
    }}



