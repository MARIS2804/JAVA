public class Bubble{
    public static void main(String[] args) {
        // Bubble sort is comparing pair of adjacent elements and swap when they are not in order.
        // O(n^2)
        int[] array={9,5,4,8,3,6,1,7,2};
        bubblesort(array);
        for(int i:array){
            System.out.print(i);
        }
    }
    public static void bubblesort(int[] array){
        int swap=1;
        while(swap==1){
           swap=0;
           for(int i=0;i<array.length-1;i++){
                if(array[i]<array[i+1]){
                    swap=1;
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
           }
        }
    }
}