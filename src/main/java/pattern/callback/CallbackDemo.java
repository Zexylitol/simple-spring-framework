package pattern.callback;

/**
 * @author yzz
 * @create 2022-05-08 10:34
 */
public class CallbackDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("sleeping... ");
                    Thread.sleep(2000);
                    System.out.println("Call-back Thread");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
