public class RotateArrayNtimes {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
//                    3, 99, -1, -100

        int k = 2+1;

        k = k % arr.length;
        int[] newArr = new int[k];

        for(int i = 0 ;i < k ; i++){
            newArr[i] = arr[i];
        }

        for( int i = 0; i < arr.length - k ; i++){
            arr[i] = arr[i+k];
        }

        for( int i = arr.length - k ; i < arr.length ; i++){
            arr[i] = newArr[i - arr.length + k];
        }


        for(int i = 0 ;i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
