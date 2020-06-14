public class Abstract {
    public static void main(String[] args) {
    Fruit f = new Apple();
    AbstractDemo a =new AbstractDemo();
    a.show(f);
    }

}
abstract class Fruit {

    public Fruit(){}
    public Fruit(int a){}
    public abstract void eat(int a);
}

class Apple extends Fruit{

    public Apple(){}
    public Apple(int a){
        super(a);
    }

    @Override
    public void eat(int a) {
            System.out.println("eat "+ a +" apple");
    }
}

class AbstractDemo{
    public void show(Fruit f) {
        f.eat(1);
    }
}