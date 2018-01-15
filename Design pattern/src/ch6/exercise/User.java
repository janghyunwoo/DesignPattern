package ch6.exercise;

public class User extends Thread{
	private String name;
	private Ticket ticket;
	private TicketMachine ticketMachine;
	
	public User(String name,TicketMachine ticketMachine) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.ticketMachine = ticketMachine;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 티켓 번호:"+buyTicket());
	}


	public int buyTicket() {
		ticket = ticketMachine.getTicket();
		
		return ticket.getSerialNumber();
	}
	
}
