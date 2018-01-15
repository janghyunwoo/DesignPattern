package ch6.exercise;

public class NormalTicket implements Ticket {
	private int serialNumber = 0; 

	public NormalTicket(int serialNumber) {
		// TODO Auto-generated constructor stub
		this.serialNumber = serialNumber;
	}

	@Override
	public int getSerialNumber() {
		// TODO Auto-generated method stub
		return serialNumber;
	}

}
