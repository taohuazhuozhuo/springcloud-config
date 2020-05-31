import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Tao
 * @date 2020/5/29 - 10:12
 */
public class list_copy {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] b=list_copy.remove(a,6,200);
        System.out.println(Arrays.toString(b));
    }







    public static int[] remove(int[] s, int index,int value) {
        int[] s2=new int[s.length+1];

        System.arraycopy(s, 0, s2, 0, s.length );
        for(int i:s2){
            System.out.println(i);
        }

        System.arraycopy(s2,index,s2,index+1,s2.length-index-1);
        s2[index]=value;

        return s2;


    }
}