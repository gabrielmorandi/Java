package ArchiveDownloadSimulator;

import java.util.Random;

public class DownloadTask implements Runnable {

  private String fileName;

  public DownloadTask(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void run() {
    System.out.println("Iniciando o download do arquivo: " + fileName);
    Random rand = new Random();
    int timeToDownload = rand.nextInt(5) + 1;
    try {
      Thread.sleep(timeToDownload * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Download do arquivo concluído: " + fileName);
  }
}
