import java.util.Scanner;
 public class Ex5 {
    public static void main(String[] args) {

        int[] t1 = {2,4,6,8,10,12,14,16,18,20};
        int[] t2 = {1,3,5,7,9,11,13,15,17,19};
        int[] t3 = new int[20];

        int i = 0, j = 0, k = 0;

        while (i < 10 && j < 10) {

            if (t2[j] < t1[i]) {
                t3[k] = t2[j];
                j++;
            } else {
                t3[k] = t1[i];
                i++;
            }

            k++;
        }
        while (i < 10) {
            t3[k] = t1[i];
            i++;
            k++;
        }
        while (j < 10) {
            t3[k] = t2[j];
            j++;
            k++;
        }
        for (i = 0; i < 20; i++) {
            System.out.print(t3[i] + " ");
        }
    }
}
    