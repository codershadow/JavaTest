package com.test.one;

//主程序
public class SaleSystem {
	public static void main(String args[]){
		Service service = new Service ("北京-->上海",5);
		TicketSaler sale = new TicketSaler("售票程序", service);
		Thread thread[] = new Thread[8];
		for (int i = 0; i < thread.length; i++) {
			thread[i] = new Thread(sale, "窗口"+(i + 1));
			thread[i].start();
		}
	}

}
