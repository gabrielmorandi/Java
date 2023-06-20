package ProcessRequestsSimulator;

import java.util.Random;

public class Request {

  private String name;

  public Request(String name) {
    this.name = name;
  }

  public void process() {
    System.out.println("Iniciando processo da requisição: " + name);
    Random rand = new Random();
    int timeToProcess = rand.nextInt(5) + 1;
    try {
      Thread.sleep(timeToProcess * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Requisição processada: " + name);
  }
}
