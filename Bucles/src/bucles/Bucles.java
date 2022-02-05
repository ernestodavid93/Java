package bucles;

public class Bucles {

	public static void main(String[] args) {
	
	
		//forR();
		//whileR();
		//forEachR();
		whileBreak();
	}
	
	private static void forR() {
		for(int i=0; i < 5; i++ ) {
			System.out.println(i);
		}
	}
	
	private static void whileR() {
		int i = 0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
	}
	
	private static void forEachR() {
		
			
			float[] numbers = {1,2,3,4,5};
			
			for(float number:numbers) {
			
			System.out.println(number);

		
		}

	}
	
	private static void whileBreak() {
		int i = 0;
	    while (i < 10) {
	      if (i == 4) {
	        i++;
	        continue;
	      }
	      System.out.println(i);
	      i++;
	    }  


	}

	
}
	
	
