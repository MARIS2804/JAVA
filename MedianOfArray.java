import java.util.ArrayList;
import java.util.Scanner;

public class MedianOfArray {

    public static double median(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        int max_len = Math.max(array1.size(), array2.size());
        int total_len = array1.size() + array2.size();
        double sum = 0.0;
        
        for (int i = 0; i < max_len; i++) {
            if (i < array1.size()) {
                sum += array1.get(i);
            }
            if (i < array2.size()) {
                sum += array2.get(i);
            }
        }
        
        return sum / total_len;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me values for array1 (type -1 to end):");
        while (true) {
            int val = scan.nextInt();
            if (val == -1) {
                break;
            }
            array1.add(val);
        }

        System.out.println("Give me values for array2 (type -1 to end):");
        while (true) {
            int val = scan.nextInt();
            if (val == -1) {
                break;
            }
            array2.add(val);
        }

        double med = median(array1, array2);
        System.out.println("Median = " + med);
        
        scan.close();  
    }
}
