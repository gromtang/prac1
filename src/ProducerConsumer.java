import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumer {

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Producer p1 = new Producer("p1",pc);
        Consumer c = new Consumer(pc);

        Thread c1 = new Thread(c, "c1");
        Thread c2 = new Thread(c, "c2");
        p1.start();
        c1.start();
        c2.start();
    }

    private BlockingDeque<Object> queue = new LinkedBlockingDeque<>(50);

    public void add(Object obj) {
        try {
            queue.put(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Object poll() {
        Object obj = null;
        try {
            obj = queue.take();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}

class Producer extends Thread {

    private ProducerConsumer pc = null;

    public Producer(String name, ProducerConsumer pc) {
        this.pc = pc;
        this.setName(name);
    }

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            pc.add(i);
            System.out.println(this.getName() + "生产了一个产品：" + i);
        }
    }
}

class Consumer implements Runnable {

    private ProducerConsumer pc = null;

    public Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            System.out.println(Thread.currentThread().getName() + "消费了一个产品：" + pc.poll());
        }
    }
}
