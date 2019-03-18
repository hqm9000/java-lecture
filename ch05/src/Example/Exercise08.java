package Example;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int count = 0;
		for (int i=0; i<array.length; i++) {
			for(int k=0; k<array[i].length; k++) {
				sum += array[i][k];
				count++;
			}
		}
		double avg = (double)sum / count;
		System.out.println("평균: " + avg);
		System.out.println("sum: " + sum);
		System.out.println("count: " + count);
	}

}
