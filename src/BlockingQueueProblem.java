
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by virus on 05/12/16.
 */
public class BlockingQueueProblem {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new LinkedBlockingDeque<>(10); // Can use ArrayBlockingQueue too

        for(int p=0; p<3; p++) {
            Producer producer = new Producer(p,blockingQueue);
            new Thread(producer).start();
        }


        for(int c=0; c<3; c++) {
            Consumer consumer = new Consumer(c,blockingQueue);
            new Thread(consumer).start();
        }

    }
}

class Producer implements Runnable {
    private int pId;
    private int seedValue;
    private int maxSeedValue;
    protected BlockingQueue queue = null;


    public Producer(int p, BlockingQueue queue) {
        this.pId = p;
        this.queue = queue;
        if(this.pId == 0) {
            this.seedValue = 0;
        } else if(this.pId == 1) {
            this.seedValue = 10000;
        } else if(this.pId == 2) {
            this.seedValue = 20000;
        }
        maxSeedValue = this.seedValue+10000;
    }

    public void run() {
        try {
            for(int i=this.seedValue; i<this.maxSeedValue; i++) {
                System.out.println("Producer id: "+pId+" produced "+i);
                this.queue.put(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

class Consumer implements Runnable {

    private int cId;
    protected BlockingQueue queue = null;

    public Consumer(int c, BlockingQueue queue) {
        this.cId = c;
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int value = (int)queue.take();
                if(value%2 !=0) {
                    System.out.println("Consumer ID: "+cId+" consumed "+value);
                    Thread.sleep(100);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
