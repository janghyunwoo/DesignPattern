package ch6.exercise3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aa a1=new aa(){
			@Override
			public int aa1() {
				// TODO Auto-generated method stub
				return 3;
			}
			
		};
		
		aa a2 = new bb();
		a2.aa1();
		((bb)a2).a1.aa1();
		
		
		
		System.out.println(a2.aa1());
		System.out.println(((bb)a2).a1.aa1());

	}

}

interface aa {

	  int aa1();
}

class bb implements aa {
	aa a1 = new aa(){

		@Override
		public int aa1() {
			// TODO Auto-generated method stub
			return 1;
		}};

	@Override
	public int aa1() {
		// TODO Auto-generated method stub
		return 0;
	}




	
	
}
