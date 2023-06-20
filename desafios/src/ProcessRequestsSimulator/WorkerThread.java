package ProcessRequestsSimulator;

import java.util.concurrent.BlockingQueue;

public class WorkerThread implements Runnable {

  private BlockingQueue<Request> requestQueue;

  public WorkerThread(BlockingQueue<Request> requestQueue) {
    this.requestQueue = requestQueue;
  }

  @Override
  public void run() {
    while (true) {
      try {
        Request request = requestQueue.take();
        request.process();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
