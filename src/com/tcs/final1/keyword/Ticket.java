package com.tcs.final1.keyword;

public class Ticket {
	private final String movie="Sholay";
	private float price;
	public final void sell() {
		
	}
}

class IllegalTicket extends Ticket{
	public final void sell() {
		
	}
}