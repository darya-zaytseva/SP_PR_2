public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Главный поток запущен");
        System.out.println("=== СОЗДАНИЕ 10 ПОТОКОВ ===");
        for (int i = 1; i <= 10; i++) {
            new NewThread(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Создание потоков прервано");
            }
        }
        System.out.println("=== РАБОТА ГЛАВНОГО ПОТОКА ===");
        for (int i = 100; i > 90; i--) {
            System.out.println("Главный поток: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Главный поток прерван");
            }
        }
        System.out.println("Главный поток завершен");
    }
}