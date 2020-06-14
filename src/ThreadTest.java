public class ThreadTest {
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();
        Thread td1 = new Thread(mr,"窗口1");
        Thread td2 = new Thread(mr,"窗口2");
        Thread td3 = new Thread(mr,"窗口3");

        td2.setPriority(6);//优先级
        //td3.setDaemon();//未完成
        td1.start();
        //加入，它走完别的线程才能走
        /*try {
            td1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        td2.start();
        td3.start();
    }
}


class MyRunnable implements Runnable{
    Object key = new Object();
    int tickets = 100;
    @Override
    public void run() {
        while (true){
            synchronized (key){
                if (tickets > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("窗口" + Thread.currentThread().getName() +"正在出售第" +
                            tickets-- + "张票");
                    //Thread.yield(); //礼让
                }
            }
        }
    }
}
