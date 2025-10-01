public class NewThread implements Runnable {
    Thread thread;
    private int threadNumber;
    public NewThread(int threadNumber) {
        this.threadNumber = threadNumber;
        thread = new Thread(this, "Поток-" + threadNumber);
        System.out.println("Создан: " + thread);
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("Дочерний поток " + threadNumber + " запущен");
        for (int i = 5; i > 0; i--) {
            System.out.println("Поток " + threadNumber + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток " + threadNumber + " прерван");
            }
        }
        System.out.println("Дочерний поток " + threadNumber + " завершен");
    }
}