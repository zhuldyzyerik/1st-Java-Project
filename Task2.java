package Project1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       /*
        2)Using Scanner create an array of countries. When an array is created, retrieve all values from it and while
        retrieving those values print capital for each country. (use 2 different loops).
        */

        Scanner in= new Scanner(System.in);
        String[] countries = new String[5];
 /*for(int i =0; i<countries.length;i++){
            System.out.println("Please enter countries");
            countries[i]= in.next();
    System.out.println("Please enter its capital city");
    String capitals=in.next();
    System.out.println("The capital city of " + countries[i] + " is" + " "+capitals);
        }


  */

        int i=0;
       while(i<countries.length){
           System.out.println("Please enter countries");
           countries[i] = in.next();
           System.out.println("Please enter its capital city");
           String capitals = in.next();
           System.out.println("The capital city of " +countries[i] + " is " + capitals);
           i++;
       }
    }
}

