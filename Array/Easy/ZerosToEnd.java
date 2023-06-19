public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        int temp[] = new int[arr.length];
        int k = 0;

        for(int i = 0 ;i< arr.length ; i++){
            if(arr[i] != 0){
                temp[k] = arr[i];
                k++;
            }
        }

        while( k < arr.length){
            arr[k] = 0;
            k++;
        }

        for(int i =0 ;i<arr.length ; i++){
            System.out.print(temp[i] + " ");
        }
    }
}
