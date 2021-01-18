package Array;

public class Random implements Runnable {
    public void run() {
        while (true) {
            int number = (int) Math.floor(((Math.random() * 899999) + 100000));
            System.out.println(number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        public static void main (String[] args){
            Random r = new Random();
            Thread t = new Thread(r);
            t.start();
        }
    }

