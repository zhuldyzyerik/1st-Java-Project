package Project1;

public class Task3 {
    // Create a 2D array of integer values. Print the sum of all numbers.
    public static void main(String[] args) {
        int[][] oddNumbers = {{1, 5, 3, 7}, {11, 5, 7, 9}};
        int sum=0;
        for(int i=0; i< oddNumbers.length;i++){
            for(int j=0; j<oddNumbers[0].length;j++){
                sum+=oddNumbers[i][j];
            }
        }
        System.out.println("sum =  " +sum);


}}



