import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int temp;

        for(int i=1;i<arr.length;i++){
            temp = arr[i];
            for(int j=i-1;j>=0;j--){
                if(temp < arr[j]){
                    arr[j+1]  = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
