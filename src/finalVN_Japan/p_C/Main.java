package finalVN_Japan.p_C;

import java.util.*;

//https://procon-questions.s3.us-east-2.amazonaws.com/final/C_vietnam.html
public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	while (true) {
	  int n = sc.nextInt() * 2;
	  if (n == 0) {
		break;
	  }
	  int sumFloor = 0;
	  int minFloor = 0;
	  for (int i = 1; i <= Math.sqrt(n); i++) {
		if (n % i == 0) {
		  int x = n / i + 1 - i;
		  if (x > 0 && x % 2 == 0) {
			sumFloor = i;
			minFloor = x / 2;
		  }
		}
	  }
	  sb.append(minFloor).append(" ").append(sumFloor).append("\n");
	}
	System.out.print(sb);
  }
}
