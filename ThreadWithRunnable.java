class ThreadDemo implements Runnable {
    public void run() {
        // compute primes larger than minPrime
         System.out.println("Thread"+Thread.currentThread().getId());
    }
}

public class ThreadWithRunnable {
    public static void main(String[] args) {


        for(int i=0; i<9 ; i++) {
            Thread obj = new Thread(new ThreadDemo());
            obj.start();
        }
    }
}
