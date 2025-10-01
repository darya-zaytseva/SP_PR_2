public class ThreadDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new NewThread1(), "Поток-" + i);
            thread.start();
        }
    }
    static class NewThread1 implements Runnable {
        @Override
        public void run() {
            for (int i = 5; i > 0; i--) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}