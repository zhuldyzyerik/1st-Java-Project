package Project1;

public class Task9 {
    public static void main(String[] args) {
        // 9)Maximum and minimum number in the array?

int a[]={50,30,80,10,89};
/*int max=a[0]; //50
for(int i=1; i<a.length;i++){
    if(a[i]>max){ //30>80 false
        max=a[i]; //50
    }
}
System.out.println("maximum Element is array is:" +max);

 */

        int min=a[0];//50
        for(int i=1; i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum Element is array is:" +min);
    }

}
