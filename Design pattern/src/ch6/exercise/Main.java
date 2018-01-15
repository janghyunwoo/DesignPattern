package ch6.exercise;

public class Main {
	static User[] user = new User[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketMachine ticketMachine = TicketMachine.getTicketMachine();
		ticketMachine.setTicketLimit(5);

		for (int i = 0; i < user.length; i++) {

			new User(String.valueOf(i + 1),ticketMachine).start();
		}

	}

}
