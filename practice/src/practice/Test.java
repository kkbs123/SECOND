package practice;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		int i;
		try (//��������
		Scanner input = new Scanner(System.in)) {
			System.out.println("������ɼ�:");
			//������̬���� 
			double[] scores = new double[5];
			for (i = 0; i < scores.length; ++i) {
				scores[i] = input.nextDouble();
				
			}
			
			for (i = 0; i < scores.length; ++i) {
				System.out.println(scores[i]);
			}
			
		}
		
	}

}
