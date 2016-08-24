package com.test.one;

class ThreadDemoTwo implements Runnable {
	public void run() {
		synchronized(this){
			for (int x = 0; x < 60; x++) {
				System.out.println(Thread.currentThread().getName()+x);
			}
		}
	}
	
}
public class Demo_Two {
	public static void main(String args[]) {
		ThreadDemoTwo demo = new ThreadDemoTwo();
		Thread t = new Thread(demo);
		t.start();
		for (int x = 0; x < 60; x++) {
			System.out.println(Thread.currentThread().getName()+x);
		}
	}

}
