package ch6.exercise2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static final int THREAD_NUM = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserThread[] user = new UserThread[THREAD_NUM];
		for (int i = 0; i < THREAD_NUM; i++) {
			new UserThread((i + 1) + "-thred").start();
		}
	}

}

class Printer {
	private boolean available = true;
	private int serialNumber;

	Printer(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public boolean isAvailable() {
		return available;
	}

	public void print(String name) {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println(name + "is using" + this.serialNumber);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setAvailable(true);
	}

	public void setAvailable(boolean available) {
		// TODO Auto-generated method stub
		this.available = available;
	}

}

class UserThread extends Thread {
	private Printer myPrinter;

	public UserThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrinterManager mgr = PrinterManager.getPrinterManger();
		myPrinter = mgr.getPrinter();
		myPrinter.print(getName());
	}
}

class PrinterManager {
	private static PrinterManager printerManager = null;
	private Printer[] printers = { new Printer(1), new Printer(2), new Printer(3) };

	private PrinterManager() {
	}

	public static synchronized PrinterManager getPrinterManger() {
		// TODO Auto-generated method stub
		if (printerManager == null) {
			printerManager = new PrinterManager();
		}

		return printerManager;
	}

	public synchronized Printer getPrinter() {
		// TODO Auto-generated method stub
		while (true) {

			for (Printer userPrinter:printers) {

				if (userPrinter.isAvailable() == true) {
					userPrinter.setAvailable(false);
					return userPrinter;
				}
			}

		}

	}

}

/*
 * class PrinterManager { private static PrinterManager mgr = null; private
 * ArrayList<Printer> managedPrinters = new ArrayList<Printer>();
 * 
 * private PrinterManager() { managedPrinters.add(new Printer(1));
 * managedPrinters.add(new Printer(2)); managedPrinters.add(new Printer(3)); }
 * 
 * public static synchronized PrinterManager getPrinterManger() { // TODO
 * Auto-generated method stub if (mgr == null) { mgr= new PrinterManager(); }
 * 
 * return mgr; }
 * 
 * public synchronized Printer getPrinter() { // TODO Auto-generated method stub
 * 
 * while (true) { for(Printer printer:managedPrinters){
 * if(printer.isAvailable()){ printer.setAvailable(false); return printer; } }
 * 
 * }
 * 
 * }
 * 
 * }
 */
