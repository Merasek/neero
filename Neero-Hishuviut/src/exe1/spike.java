package exe1;

import java.util.Random;

public class spike {


	public void bucket (){
		int like = -170;
		int MAX_CAPASITY = 1500;
		int capasity = 0;
		int input = 340;
		int num_input = 3;
		int spike = 0;

		int n = 10000;
		while(n >0){
			Random random = new Random();
			int r = random.nextInt(3)+1;
			if(r == num_input){
				capasity +=input; 
				if(capasity > MAX_CAPASITY){
					spike ++;
					capasity = 0;
				}

			}
			if(capasity > 0)
				capasity = capasity + like;
			System.out.println("capasity end: " + capasity);
			n--;
		}
		System.out.println("SPIKE: " + spike);
	}


	public void bucket2(){
		int[] taps = new int[2];
		int[] randoms = new int[taps.length];
		int input = 100;
		int spike = 0;
		int leak = -2;
		int MAX_CAPASITY = 2000;
		int capasity = 0;

		int n = 20;//time

		Random random = new Random();
		for (int i = 0; i < taps.length; i++) {
			taps[i] = random.nextInt(5)+1;
		}
		while(n >0){
			for (int i = 0; i < randoms.length; i++) {
				randoms[i] = random.nextInt(5)+1;
			}
			for (int i = 0; i < taps.length; i++) {
				if(randoms[i] == taps[i]){
					capasity +=input; 
					if(capasity > MAX_CAPASITY){
						spike ++;
						capasity = 0;
					}
				}
			}

			if(capasity > 0)
				capasity = capasity + leak;
			System.out.println("capasity end: " + capasity);
			n--;
		}
		System.out.println("SPIKE: " + spike);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		spike sp = new spike();
		//sp.bucket();
		sp.bucket2();
	}

}
