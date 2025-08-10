import java.util.Scanner;
class move_all_zero_to_end{
    public static int[] move_zero(int[] array){
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[j++]=array[i];
            }
        }
        while(j<array.length){
            array[j++]=0;
        }
        return array;

    }
           public static void main(String[] args){
            Scanner get = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = get.nextInt();
            
            int[] array = new int[size];
            
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = get.nextInt();
            }
            int[] array1=move_zero(array);
            System.out.println(array1);
            for (int num : array1) {
                System.out.print(num + " ");
            }

           }
}