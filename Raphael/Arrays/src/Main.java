public class Main {

	public static void main(String[] args) {

		int [] numbers = new int[100];

	for (int i = 0; i < numbers.length; i++){
		numbers [i] = i * i;
	}

		for (int i = 0; i < numbers.length; i++){
			System.out.println(numbers [i]);
		}
	}
}