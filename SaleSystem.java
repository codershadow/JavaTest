package com.test.one;

//������
public class SaleSystem {
	public static void main(String args[]){
		Service service = new Service ("����-->�Ϻ�",5);
		TicketSaler sale = new TicketSaler("��Ʊ����", service);
		Thread thread[] = new Thread[8];
		for (int i = 0; i < thread.length; i++) {
			thread[i] = new Thread(sale, "����"+(i + 1));
			thread[i].start();
		}
	}

}
