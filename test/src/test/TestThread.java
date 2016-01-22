package test;

class RunnableDemo implements Runnable {
	   
private Thread t=null;
	 
public void run() {
      System.out.println("Running ");
      try {
	         for(int i = 4; i > 0; i--) {
	           System.out.println("i " + i);
	            //Thread.sleep(5);
	         }
	         
	     } catch (Exception e) {
	         System.out.println("Thread " );
	     }
	   }
	   
	   public void start ()
	   {
	      System.out.println("begin  ");
	      if (t == null)
	      {
	         t = new Thread(this);
	         t.start ();
	      }
	   }

	}

	public class TestThread {
	   public static void main(String args[]) {
	   
	      RunnableDemo R1 = new RunnableDemo();
	      R1.start();
	      
	      RunnableDemo R2 = new RunnableDemo();
	      R2.start();
	   }   
	}