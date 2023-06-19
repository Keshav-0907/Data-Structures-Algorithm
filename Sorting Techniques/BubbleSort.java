import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 4;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter a Array : ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Array : ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();


        for(int i = 0 ; i < n ; i++){
            for( int j = i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Sorted  Array : ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
