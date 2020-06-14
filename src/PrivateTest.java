public class PrivateTest {

    private int pri(){
        return 1;
    }

    public static void main(String[] args) {
        PrivateTest p = new PrivateTest();
        System.out.println(p.pri());
    }
    public class AnotherClass{
        PrivateTest p = new PrivateTest();
        // p.pri(); 不能调用了
    }
}
