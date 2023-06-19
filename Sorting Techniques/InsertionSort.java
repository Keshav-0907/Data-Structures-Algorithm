public class InsertionSort {
    class Solution
    {
        static void insert(int arr[],int i)
        {
            for(i=1 ; i<arr.length ; i++){
                int temp = arr[i];
                int j = i-1;
                while( j>=0 && arr[j]>temp ){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = temp;
            }
        }
        //Function to sort the array using insertion sort algorithm.
        public void insertionSort(int arr[], int n)
        {
            insert(arr, n);
        }
    }
}
