package com.test.one;

//¹ºÆ±·şÎñ
public class Service {
	private String ticketName;
	private int ticketSum;
	private int remain;
	
	public Service(String ticketName, int ticketSum) {
		this.ticketName = ticketName;
		this.ticketSum = ticketSum;
		this.remain = ticketSum;
	}
	
	public synchronized int SaleTicket(int ticket){
		if(remain > 0){
			remain -= ticket;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (remain >= 0) {
				return remain;
			}else{
				remain += ticket;
				return -1;
			}
		}
		return -1;
	}
	public synchronized int getremain() {
		return remain;
	}
	public String getTicketName() {
		return ticketName;
	}
}
