package reed.test.sync;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/6/22
 * @time 15:24
 */
public class SyncFunc {
    public synchronized void func1() {
        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is stop");
    }

    public static void main(String[] args) {

        NewThread newThread1 = new NewThread();
        NewThread newThread2 = new NewThread();
        NewThread newThread3 = new NewThread();

        newThread1.start();
        newThread2.start();
        newThread3.start();

    }
}

class NewThread extends Thread {

    static SyncFunc syncFunc = new SyncFunc();

    @Override
    public void run() {
        syncFunc.func1();
    }

}
