package ProcessRequestsSimulator;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Server {

  private static final int NUM_WORKERS = 5;

  public static void main(String[] args) {
    BlockingQueue<Request> requestQueue = new LinkedBlockingQueue<>();

    for (int i = 0; i < NUM_WORKERS; i++) {
      WorkerThread worker = new WorkerThread(requestQueue);
      Thread thread = new Thread(worker);
      thread.start();
    }

    for (int i = 0; i < 20; i++) {
      Request request = new Request("Requisição " + i);
      try {
        requestQueue.put(request);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
