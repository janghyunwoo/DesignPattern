/**
 * 
 */
package dddd;


/**
 * @author Jang_home_n
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wefwef ww= new wefwef(1, 1);
		System.out.println(ww.a+","+ww.b);
		 ww.getIns();
		 ww.getIns11();
		System.out.println(ww.a+","+ww.b);
		
		
		Complex a = new Complex(8, 3); // ���Ҽ� 8+3i
	    Complex b = new Complex(5, 2); // ���Ҽ� 5+2i


	    // ���Ҽ��� ����
	    System.out.println(Complex.multiply(a, b));
	    // ��� ���: 34.0+31.0i
	    
	    System.out.println(a.multiply(b));
	    
	    aaa a1 = new aaa();
	    a1.a();
		
	}

}

class aaa{
	
	void a(){
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "������";
	}
}
