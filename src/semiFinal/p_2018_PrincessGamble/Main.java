package semiFinal.p_2018_PrincessGamble;

import java.util.Scanner;

//https://onlinejudge.u-aizu.ac.jp/problems/2018
public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] dataSet = new int[3];
	while (true) {
	  for (int i = 0; i < 3; i++) {
		dataSet[i] = Integer.parseInt(sc.next());
	  }
	  if (dataSet[0] + dataSet[1] + dataSet[2] == 0) {
		break;
	  }
	  int result = 0;
	  int x = 0;
	  for (int i = 0; i < dataSet[0]; i++) {
		int dt = Integer.parseInt(sc.next());
		result += dt;
		if (i == dataSet[1] - 1) {
		  x = dt;
		}
	  }
	  if (x == 0) {
		System.out.println(0);
	  } else {
		System.out.println(result * (100 - dataSet[2]) / x);
	  }
	}
  }
}
