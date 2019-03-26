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

class MyThread implements Runnable {
  int count;

  MyThread() {
    count = 0;
  }
  public void run() {
    System.out.println("::::: Minha Thread iniciou!.");
    try {
      do {
        Thread.sleep(500);
        System.out.println("::::: Na minha thread, count vale: " + count);
        count++;
      } while (count < 5);
    } catch (InterruptedException exc) {
      System.out.println("::::: minha thread interrompida.");
    }
    System.out.println("::::: minha thread terminou!.");
  }
}

class RunnableDemo {
  public static void main(String args[]) {
    System.out.println(">>>>>>>>Thread Principal COMEÇOU.");
    MyThread mt = new MyThread();
    Thread newThrd = new Thread(mt);
    newThrd.start();
    do {
      System.out.println(">>>>>>>>Na Thread Principal....");
      try {
        Thread.sleep(250);
      } catch (InterruptedException exc) {
        System.out.println(">>>>>>>>Thread Principal interrompida!");
      }
    } while (mt.count != 5);
    
      

    System.out.println(">>>>>>>> Thread Principal Encerrada!");
  }
}

   
