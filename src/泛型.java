/**
 * @author Tao
 * @date 2020/5/29 - 18:18
 */
public class 泛型 {
    public static void main(String[] args) {
        MyCollection<String> myCollection=new MyCollection<String>();
        myCollection.set("cat",0);
        System.out.println(myCollection.get(0));

    }
}

class MyCollection<E>{

    Object[] objs=new Object[5];

    public void set(E e,int index){
        objs[index]=e;


    }
    public E get(int index){

        return (E)objs[index];
    }


}