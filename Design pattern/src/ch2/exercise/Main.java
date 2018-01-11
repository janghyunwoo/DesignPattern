/**
 * 파일 이름 : Main.java
 * 만든 날짜 : 2017. 11. 30.
 */
package ch2.exercise;

/**
 * @author 장현우(ehrtk2003@gmail.com)
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Song ss= new a();
		System.out.println(ss.tumpPrice());
		
		ss=new b();
		System.out.println(ss.tumpPrice());
		
		
		
		
		
		/*Song s1 = new a();
		
		s1.setMode(new OnSale());
		s1.setMode(new NonDiscount());
		Song s2 = new Song();
		s2.setMode(new OnSale());
		
		Song s3 = new Song();
		s3.setMode(new TodayEvent());
		Song s4 = new Song();
		s4.setMode(new NonDiscount());
		
		CartForSongs c= new CartForSongs();
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);

		System.out.println(c.calculateTotalPrice());*/
	}

}

