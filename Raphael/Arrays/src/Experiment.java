public class Experiment {
	public static void main(String[] args) {
		double[] ergebnisse = {1.3,4.5,4.6,4.7,1.8};
		double sum = 0;

		for (int i = 0; i < ergebnisse.length; i++){
			sum += ergebnisse[i];
		}

		System.out.println(sum / ergebnisse.length);
	}
}
