import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * @author Tao
 * @date 2020/5/29 - 9:13
 */
public class Test {
    static void test(A a) {

        System.out.println("a");
        a.eat();
    }

    public static void main(String[] args) {
        Test.test(new A() {
            @Override
            public void eat() {
                System.out.println("A");
            }
        });
    }


}

interface A {

    void eat();
}

