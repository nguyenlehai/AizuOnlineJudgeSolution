package semiFinal.p_0051_Differential;

import java.util.Arrays;
import java.util.Scanner;

//http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0051
public class Main {
  public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	{
	  int n = sc.nextInt();
	  for (int i = 0; i < n; i++) {
		char[] arr = sc.next().toCharArray();
		Arrays.sort(arr);
		int min = Integer.parseInt(new String(arr));
		int max = Integer.parseInt(new StringBuffer(new String(arr)).reverse().toString());
		int result = max - min;
		System.out.println(result);
	  }
	}
  }
}

