class Animal{
    public void eat(){
        //System.out.println("eat");
    }
    public void scream(){
        //System.out.println("scream");
    }
}
class Cat extends Animal{
    public void scream(){
        System.out.println("miao");
    }
}
class Dog extends Animal{
    public void scream(){
        System.out.println("wang");
    }
}
class AnimalTool {

    private AnimalTool(){}

    public static void getCat(Cat c){
        c.eat();
        c.scream();
    }
    public static void getDog(Dog d){
        d.eat();
        d.scream();
    }

}

public class DuoTaiTest {
    public static void main(String[] args) {
        Cat c = new Cat();
        AnimalTool.getCat(c);
    }
}









class Fu{
    int a =1;
    public void show(){
        System.out.println("Fu");
    }
}
class Zi extends Fu{
    int a = 2 ;
    public void show(){
        System.out.println("Zi");
    }
    public void method(){
        System.out.println("Zi m");
    }
}
