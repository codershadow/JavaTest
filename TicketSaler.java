package com.test.one;

//���߳�
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
				System.out.println(Thread.currentThread().getName() + "���۵�" +service.getremain() + "��Ʊ");
				int remain = service.SaleTicket(1);
				if (remain >= 0) {
					System.out.println("���۳ɹ���ʣ��" + remain +"��Ʊ");
				}else{
					System.out.println("��Ʊʧ�ܣ���Ʊ������");
				}
			}
		}
	}

}
