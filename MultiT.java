import javax.sound.midi.Soundbank;

class ThreadDemo extends Thread {
    public void run() {
        // compute primes larger than minPrime
         System.out.println("Thread"+Thread.currentThread().getId());
    }
}

public class MultiT {
    public static void main(String[] args) {


        for(int i=0; i<9 ; i++) {
            ThreadDemo obj = new ThreadDemo();
            obj.start();
        }
    }
}
