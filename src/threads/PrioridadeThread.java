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
public class PrioridadeThread extends Thread {

  PrioridadeThread(String name, int pri) {
    super(name);
    setPriority(pri);
    start();
  }

  public void run() {
    System.out.println(getPriority());
  }
  
   public static void main(String args[]) throws Exception {
       
    PrioridadeThread mt2 = new PrioridadeThread("Low Priority", Thread.NORM_PRIORITY - 1);
    PrioridadeThread mt1 = new PrioridadeThread("High Priority", Thread.NORM_PRIORITY + 1);
    mt1.join();
    mt2.join();

  }
}



   
