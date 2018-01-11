/**
 * ���� �̸� : CartForSongs.java
 * ���� ��¥ : 2017. 11. 30.
 */
package ch2.exercise;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author ������(ehrtk2003@gmail.com)
 *
 */
public class CartForSongs {
	ArrayList<Song> cart = new ArrayList<Song>();

	
	public double calculateTotalPrice() {
		double total = 0.0;
		Iterator<Song> itr = cart.iterator();
		
		while(itr.hasNext()){
			Song s = itr.next();
			
			total = total + s.getPrice();
		}
		return total;
	}
	
	public void add(Song s) {
		cart.add(s);
	}
}
