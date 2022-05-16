import java.util.Scanner;
public class Arreglo4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int arr[][];
		int i;
		int j;
		arr = new int[5][4];
		i = 0;
		j = 0;
        arr[0][0] = 1;
		arr[1][0] = 2;
		arr[2][0] = 3;
		arr[3][0] = 4;
		arr[4][0] = 5;
		arr[0][1] = 6;
		arr[1][1] = 7;
		arr[2][1] = 8;
		arr[3][1] = 9;
		arr[4][1] = 10;
		arr[0][2] = 11;
		arr[1][2] = 12;
		arr[2][2] = 13;
		arr[3][2] = 14;
		arr[4][2] = 15;
		arr[0][3] = 16;
		arr[1][3] = 17;
		arr[2][3] = 18;
		arr[3][3] = 19;
		arr[4][3] = 20;

        for (i = 0; i <= 4-1; i++) {
			for (j = 0; j <= 5-1; j++) {
				if (arr[j][i] < 10) {
					System.out.print("0");
				}
				System.out.print(arr[j][i] + " ");
			}
			System.out.println(" ");
		}
    }
}
