class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Runnable instances
        MyThread obj1 = new MyThread();
        MyThread obj2 = new MyThread();

        // Creating Thread objects
        Thread t1 = new Thread(obj1, "Thread 1");
        Thread t2 = new Thread(obj2, "Thread 2");

        // Starting threads
        t1.start();
        t2.start();
    }
}
