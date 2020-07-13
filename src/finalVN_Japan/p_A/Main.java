package finalVN_Japan.p_A;

import java.util.Scanner;

//https://procon-questions.s3.us-east-2.amazonaws.com/final/A_vietnam.html
public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (true) {
	  int n = sc.nextInt();
	  if (n == 0) {
		break;
	  }
	  int[] incomeData = new int[n];
	  double averageIncome = 0;
	  for (int i = 0; i < n; i++) {
		incomeData[i] = sc.nextInt();
		averageIncome += incomeData[i];
	  }
	  averageIncome /= n;
	  int count = 0;

	  for (int i = 0; i < n; i++) {
		if (incomeData[i] <= averageIncome) {
		  count++;
		}
	  }
	  System.out.println(count);
	}
  }
}
