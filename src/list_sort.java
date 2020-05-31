import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author Tao
 * @date 2020/5/29 - 12:22
 */
public class list_sort {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 6, 3, 9, 3, 10};
        int temp = 0;
        for (int j = 0; j < a.length - 1; j++) {
            boolean flag = true;
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i + 1] < a[i]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = false;
                }

            }
            if (flag) {
                break;
            }
        }
    }


}
