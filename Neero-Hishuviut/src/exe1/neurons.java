package exe1;

import java.util.Random;

public class neurons {

	
	public void matrix (){
		int [][] mat = new int [10][10];
		Random random = new Random ();
		int count_e=0,count_i=0, count_n=0;
		
		String [] results = {"Inhibitory", "not conected", "excitatory"};
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=random.nextInt(3)-1;
				System.out.print(" " + mat[i][j]);
				switch(mat[i][j]){
					case -1: 
						count_i++;
						break;
					case 0: 
						count_n++;
						break;
					case 1: 
						count_e++;
						break;
					default :
					break;
				}
			}
				System.out.println();
		}
		System.out.println("Inhibitory = "+ count_i +"\nnot conected = " + count_n +"\nexcitatory = "+count_e);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		neurons tt = new neurons();
		tt.matrix();
	}

}
