package ch6.exercise;

public class TicketMachine {
	private static TicketMachine ticketMachine = null;
	private int ticketLimit;

	private TicketMachine() {
	}

	public void setTicketLimit(int ticketLimit) {
		this.ticketLimit = ticketLimit;
	}

	public static synchronized TicketMachine getTicketMachine() {
		if (ticketMachine == null) {
			ticketMachine = new TicketMachine();
		}
		return ticketMachine;
	}

	public Ticket getTicket() {

		synchronized (this) {
			if (ticketLimit > 0) {
				return new NormalTicket(ticketLimit--);
			} else {
				return new NullTicket();
			}
		}


	}

}
