import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PhoneFactory {

    public static void main(String[] args) {
        PhoneFactory pf = new PhoneFactory();
        pf.makePhone("HuaWeiPhone");
        ExecutorService tp = Executors.newCachedThreadPool();
    }

    public Phone makePhone(String phoneType) {

        if (phoneType.equalsIgnoreCase("HuaWeiPhone")) {
            return new HuaWeiPhone();
        } else if (phoneType.equalsIgnoreCase("IPhone")){
            return new IPhone();
        }
        return null;
    }
}

class HuaWeiPhone implements Phone {

    public HuaWeiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产了一台华为手机");
    }
}

class IPhone implements Phone {

    public IPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产了一台iPhone手机");
    }
}

interface Phone {
    void make();
}