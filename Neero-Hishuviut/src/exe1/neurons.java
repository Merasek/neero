package exe1;

import java.util.Arrays;
import java.util.Random;

public class neurons {


	public void matrix (){
		int [][] mat = new int [10][10];
		Random random = new Random ();
		int count_e=0,count_i=0;

		int [] results = {-1, 1};
		for (int i = 0; i < 10; i++) {
			int x = random.nextInt(10);
			int y = random.nextInt(10);
			int ran = random.nextInt(2);
			if(ran == 0)
				mat[x][y]=-1;
			else
				mat[x][y] = ran;
		}
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int x = random.nextInt(10);
			int y = random.nextInt(10);
			arr[i] = mat[x][y];
			sum += mat[x][y];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		if(sum > 0 ) System.out.println("sum "+  1);
		else System.out.println("sum " + 0);
		for (int j = 0; j < mat.length; j++) 
			System.out.println(Arrays.toString(mat[j]));

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		neurons tt = new neurons();
		tt.matrix();
	}

}
