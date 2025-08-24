public class SelectionSort {
    public static void main(String[] args) {
        //Selection sort -> it search through the array and find minimum value for each iteration and at end of each iteration swap the variable
        // with starting iterated postion
        // O(n^2)
            int[] array={9,5,4,8,3,6,1,7,2};
            selectionsort(array);
            for(int i:array){
                System.out.print(i);
            }
    }
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[min]>arr[j]){
                min=j;
               }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
