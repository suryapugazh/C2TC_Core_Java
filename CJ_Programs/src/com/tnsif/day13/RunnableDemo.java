package com.tnsif.day13;

public class RunnableDemo {
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		UsingRunnable obj = new UsingRunnable(10, 20, "Hello");
		

		Runnable runnable = new Runnable() {
			@Override
			public void run() { 
				System.out.println("Runnable with Anonymous Class");
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		runnable = () -> { 
			System.out.println("Runnable with Lambda Expression");
		};
		
		new Thread(runnable).start();

		System.out.println("______________________________");
		int n=5;
		runnable = () -> {
			try {
				for (int i = 1; i <= n; i++) {
					System.out.println("Loop iteration: " + i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.err.println("Task interrupted!");
			}
		};

		
		new Thread(runnable).start();

	}
}