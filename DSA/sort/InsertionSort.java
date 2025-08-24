public class InsertionSort {
    public static void main(String[] args) {
        //Insertion sort -> comparing all values to left and 
            int[] array={9,5,4,8,3,6,1,7,2};
            insertionsort(array);
            for(int i:array){
                System.out.print(i+" ");
            }

    }
    public static void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}


