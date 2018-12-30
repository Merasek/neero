package exe1;

import java.util.*;

public class spike {


	public void bucket_A (){
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

					capasity -= input;  //capasity =0;
				}

			}
			if(capasity > 0)
				capasity = capasity + like;
			System.out.println("capasity end: " + capasity);
			n--;
		}
		System.out.println("SPIKE: " + spike);
	}


	public void bucket_B(){
		int[] taps = new int[2];
		int[] randoms = new int[taps.length];
		int input = 100;
		int spike = 0;
		int leak = -2;
		int MAX_CAPASITY = 2000;
		int capasity = 0;

		int n = 100;//time

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
						capasity -=input; //capasity = 0;
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

	public void bucket_C(){
		int[] taps = new int[2];
		int spike = 0;
		int n = 100000;//time

		LinkedList<Integer> check_5 = new LinkedList<>(); 
		LinkedList<Integer> check_3 = new LinkedList<>(); 

		Random random = new Random();
		taps[0] = 3;
		taps[1] = 5;

		while(n >0){
			int random_3 = random.nextInt(5)+1;
			int random_5 = random.nextInt(5)+1;
			if(random_3 == 3)
				check_3.addFirst(1);
			else 
				check_3.addFirst(0);
			if(random_5 == 5)
				check_5.addFirst(1);
			else
				check_5.addFirst(0);
			System.out.println(check_3.toString() + "            " + check_5.toString());

			int flag = 15; //interval
			boolean counter_3 = false;
			boolean counter_5 = false;
			if(check_3.size() >= 3 && check_5.size() >= 5){
				for (int i = check_3.size(); i > 2 && check_3.size() <= flag; i--) {
					if(check_3.get(i-1) == 1)
						if(check_3.get(i-2) == 1)
							if(check_3.get(i-3) == 1){
								counter_3 = true;
								break;
							}
				}
				if(counter_3){
					for (int i = check_5.size(); i > 4 && check_5.size() <= flag; i--) {
						if(check_5.get(i-1) == 1)
							if(check_5.get(i-2) == 1)
								if(check_5.get(i-3) == 1)
									if(check_5.get(i-4) == 1)
										if(check_5.get(i-5) == 1){
											counter_5 = true;
											break;
										}
					}
				}
			}

			if(check_3.size() >= flag)
				check_3.removeLast();
			if(check_5.size() >= flag)
				check_5.removeLast();
			if(counter_3 && counter_5){
				spike++;
				for (int i = 0;  check_3.size()!=2; i++) 
					check_3.removeLast();
				for (int i = 0;  check_5.size()!=4; i++) 
					check_5.removeLast();
				System.out.println("**** here was a spike ****");
			}

			n--;
		}

		System.out.println("SPIKE: " + spike);

	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		spike sp = new spike();
		//sp.bucket_A();
		//sp.bucket_B();
		sp.bucket_C();
	}

}
