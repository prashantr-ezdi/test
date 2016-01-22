package test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorservice {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		
		executorService.execute( new Runnable()
		{
			public void run()
			{
				for(int k=0; k<10; k++)
				{
					System.out.println(" i = "+k+ " Thread id : "+Thread.currentThread().getId());
				}
			}
		});	
		executorService.shutdown();
		for(int i=0; i<10; i++)
		{
			System.out.println("i ="+i+ " This is main thread, Thread id :" + Thread.currentThread().getId());
		}
		
	}

}
