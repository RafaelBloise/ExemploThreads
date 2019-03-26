/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author rafael
 */
public class ThreadUsandoSleep extends Thread {
    private int countDown = 5;

  private static int threadCount = 0;

  public ThreadUsandoSleep() {
    super("" + ++threadCount);
    start();
  }

  public String toString() {
    return "#" + getName() + ": " + countDown;
  }

  public void run() {
    while (true) {
      System.out.println(this);
      if (--countDown == 0)
        return;
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    for (int i = 0; i < 5; i++)
      new ThreadUsandoSleep().join();
  }
}
