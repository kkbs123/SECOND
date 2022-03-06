package practice;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		int i;
		try (//创建对象
		Scanner input = new Scanner(System.in)) {
			System.out.println("请输入成绩:");
			//创建动态数组 
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
