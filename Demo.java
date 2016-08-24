package com.test.one;

class ThreadDemo implements Runnable {
	public void run() {
		for (int x = 0; x < 60; x++) {
			System.out.println(Thread.currentThread().getName()+x);
		}
	}
}
public class Demo {
	public static void main(String args[]) {
		ThreadDemo demo = new ThreadDemo();
		Thread t = new Thread(demo);
		t.start();
		for (int x = 0; x < 60; x++) {
			System.out.println(Thread.currentThread().getName()+x);
		}
	}

}
