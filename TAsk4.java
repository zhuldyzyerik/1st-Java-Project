package Project1;

public class TAsk4 {
    public static void main(String[] args) {
        //4) Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.

        int numbers [][] ={{10,5,1,2},
                          {7,8,4,9,12}
                                };
        for(int i=0; i<numbers.length;i++){
            for( int j=0; j<numbers[i].length;j++){
                if(numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}
