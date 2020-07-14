package finalVN_Japan.p_E;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while (true) {
	  int d = s.nextInt();
	  int w = s.nextInt();
	  if (d == 0 && w == 0) break;
	  int[][] arrPond = new int[d][w];
	  int maxVolumeOfPond = 0;

	  //Tạo ma trận chứa dữ liệu
	  for (int i = 0; i < d; i++) {
		for (int j = 0; j < w; j++) {
		  arrPond[i][j] = s.nextInt();
		  System.out.println(arrPond[i][j]);
		}
	  }

	  //Tìm dung tích lớn nhất của tất cả các hình chữ nhật tạo ra.
	  for (int i = 1; i < d - 1; i++) {
		for (int j = 1; j < w - 1; j++) {
		  for (int k = i; k < d - 1; k++) {
			for (int l = j; l < w - 1; l++) {
			  //method volumeOfPond: Tìm ra dung tích của hình chữ nhật hiện tại
			  int temp = volumeOfPond(i, j, k, l, arrPond);
			  if (temp > maxVolumeOfPond) {
				maxVolumeOfPond = temp;
			  }
			}
		  }
		}
	  }
	  System.out.println(maxVolumeOfPond);
	}
  }

  public static int volumeOfPond(int i, int j, int k, int l, int[][] arrPond) {
    //Giá trị lớn nhất của các ô bên trong
	int max = 0;
	//Giá trị nhỏ nhất của các ô phía ngoài cùng
	int min = arrPond[i - 1][j - 1];

	for (int x = i; x <= k; x++) {
	  for (int y = j; y <= l; y++) {
		if (max < arrPond[x][y]) {
		  max = arrPond[x][y];
		}
	  }
	}

	for (int x = j - 1; x <= l + 1; x++) {
	  if (min > arrPond[i - 1][x]) {
		min = arrPond[i - 1][x];
	  }
	  if (min > arrPond[k + 1][x]) {
		min = arrPond[k + 1][x];
	  }
	}

	for (int x = i; x <= k; x++) {
	  if (min > arrPond[x][j - 1]) {
		min = arrPond[x][j - 1];
	  }
	  if (min > arrPond[x][l + 1]) {
		min = arrPond[x][l + 1];
	  }
	}

	if (max >= min) {
	  return 0;
	} else {
	  int sum = 0;
	  for (int x = i; x <= k; x++) {
		for (int y = j; y <= l; y++) {
		  sum += (min - arrPond[x][y]);
		}
	  }
	  return sum;
	}
  }
}
