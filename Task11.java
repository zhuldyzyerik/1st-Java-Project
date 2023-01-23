package Project1;

public class Task11 {
    public static void main(String[] args) {
        //11)Write a program to print out duplicate elements from an Array of Strings?
    String arr[]={"Alem","Azim","Arman","Zhuldyz","Azim"};
    boolean flag=false;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j< arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println("Found Duplicate Element: "+ arr[i]);
                flag=true;
            }
        }
    }
    if(flag==false){
        System.out.println("Duplicate element not found");
    }

    }}
