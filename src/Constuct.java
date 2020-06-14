import java.util.Objects;

public class Constuct {
    int a = 1;
    int b = 2;

    public Constuct(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Constuct{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public Constuct(){
        System.out.println("wtf");
    }

    public  void construct(int a){

        System.out.println(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constuct constuct = (Constuct) o;
        return a == constuct.a &&
                b == constuct.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
