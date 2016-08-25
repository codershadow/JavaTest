package com.test.one;

//多线程
public class TicketSaler implements Runnable {
	private String name;
	private Service service;
	
	public TicketSaler (String name, Service service){
		this.name = name;
		this.service = service;
	}
	
	public void run() {
		while(service.getremain() > 0) {
			synchronized(this) {
				System.out.println(Thread.currentThread().getName() + "出售第" +service.getremain() + "张票");
				int remain = service.SaleTicket(1);
				if (remain >= 0) {
					System.out.println("出售成功！剩余" + remain +"张票");
				}else{
					System.out.println("出票失败！该票已售完");
				}
			}
		}
	}

}
