/**
 * @author Tao
 * @date 2020/5/29 - 17:30
 */
public class 自定义异常 {
    public static void main(String[] args) throws ageException {
        person p=new person();
        p.setAge(-10);
    }

}
class ageException extends Exception{

    public ageException(){

    }
    public ageException(String name){

        super(name);
    }
}
class person{
    int age;
    public void setAge(int age) throws ageException {
        if(age<0){
            throw new ageException("年龄不能为负数");
        }
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
}