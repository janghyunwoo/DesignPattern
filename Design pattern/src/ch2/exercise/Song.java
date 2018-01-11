/**
 * 파일 이름 : Song.java
 * 만든 날짜 : 2017. 11. 30.
 */
package ch2.exercise;

/**
 * @author 장현우(ehrtk2003@gmail.com)
 *
 */
public class Song {
	private Discount DC;
	protected double price =10.0;
	
	public void setMode(Discount DC) {
		this.DC = DC;
	}

	
	public double getPrice() {
		return 10.0 - 10.0*DC.disCount();
	}
	
	public double tumpPrice() {
		return price;
	}

}

class a extends Song{
	
	public double tumpPrice() {
		
		return price - price*0.1;
	}
}

class b extends Song{
	public double tumpPrice() {
		
		return price - price*0.2;
	}
}