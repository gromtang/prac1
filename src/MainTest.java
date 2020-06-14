import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        /*
        new的函数调用？测试
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int x = sc.nextInt();
        System.out.println("请输入第二个数");
        int y = sc.nextInt();
        int c = Sum.funcSum(x,y);
        //Sum s = new Sum(x,y);    new出的对象？里xy必须是明确的数值
        System.out.println("加起来等于"+c);
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int x = sc.nextInt();
        System.out.println("请输入第二个数");
        int y = sc.nextInt();
        System.out.println("请输入第三个数");
        int z = sc.nextInt();
        System.out.println("三个数中较大的是" + Compare.compare(x,y,z));
        */

        /*
        StandardClass id = new StandardClass();
        id.setName("Flora");
        id.setSize(88);
        System.out.println(id.getName() + "'s Size:" + id.getSize());
        //String.valueof() 强制转换，这里可以不加
        //double a = 1.1; int b =(int) a; 也是强制转换
        //String a = id.name; 不可调用
        */

        /*
        Constuct c = new Constuct();
        c.construct();
        */

        /*
        Private.show();
        Private pri = new Private(); //如果Private类中构造函数为private那么就不能在这里创建对象
        */

        /*
        ExtendsTest2 e = new ExtendsTest2();
        e.show();
        */

        Fu f = new Zi();
        System.out.println(f.a);
        f.show();
        //f.method();  这样不行，得下面这样
        ((Zi) f).method();
        //Zi z = (Zi)f;直接向下转换

    }

}
