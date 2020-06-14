public class ExtendsTest extends Constuct {
    int a= 2;


    public void construct(int a){

    }
}
class ExtendsTest2 extends ExtendsTest{
    int a=3;
    public void show(){
        System.out.println(super.a);

    }
    /*
    public static void construct(){

        System.out.println(2);
    }
    */
    //方法名一样的话子类里的会覆盖掉父类的
}
