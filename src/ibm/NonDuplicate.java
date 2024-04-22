package ibm;
import java.util.Arrays;
public class NonDuplicate {
    public static void main(String[] args) {
        int n2 = 578378923;
        int n4 = n2;
        int size = 0;
        int j = 0;
        int[] arr = new int[20];
        
        while (n4 != 0) {
            arr[j++] = n4 % 10;
            n4 = n4 / 10;
            size++;
        }
        int count = 0;

        for (int i = 0; i < size; i++) {
            boolean flag = true;
            
            for (int k = i + 1; k < size; k++) {
                if (arr[i] == arr[k]) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                count = count + 1;
            }
        }

        System.out.println("Count of non-duplicate digits: " + count);
    }
}
