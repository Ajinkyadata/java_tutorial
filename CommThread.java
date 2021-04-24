class Resource {

    int x;
    Boolean flag=false;   

    public synchronized void put(int num) {

        while(flag) {
            try {wait();} catch(Exception e) {}
        }
        this.x=num;
        System.out.println("put : "+ x);        
        flag=true;
        notify();
    }

    public synchronized void get() {

        while(!flag) {
            try {wait();} catch(Exception e) {}
        }
        System.out.println("get : "+ x);
        flag=false;
        notify();
    }
}


class Producer implements Runnable {

    Resource res;

    public Producer(Resource x) {
         this.res=x;
         Thread t = new Thread(this, "producer");
         t.start();
    }
    public void run() {
        int i=0;

        while(true) {
        res.put(i++);     
        try {Thread.sleep(1000); } catch (Exception e) {}       
        }
    }
}

class Consumer implements Runnable {

    Resource res;

    public Consumer(Resource x) {
         this.res=x;
         Thread t = new Thread(this, "Consumer");
         t.start();
    }
    public void run() {

        while(true) {
            res.get();
            try {Thread.sleep(500); } catch (Exception e) {}       
            }
    }
}


public class CommThread {
    public static void main(String[] args) {

        Resource res= new Resource();
        new Producer(res);
        new Consumer(res);        
    }
}
