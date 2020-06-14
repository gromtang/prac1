public class InterfaceTest {
    public static void main(String[] args) {
        Inter ci = new ClassInter();
        ci.show();
    }
}

interface Inter{

    public static final int a = 1;
    public abstract void show();

}

class ClassInter implements Inter{
    public ClassInter(){
        super();
    }

  public void show(){
      System.out.println(Inter.a);
  }

  interface Inter1{}
  interface Inter2{}
  interface Inter3 extends Inter1,Inter2{}

}
