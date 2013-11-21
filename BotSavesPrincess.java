import java.awt.Point;
import java.util.Scanner;

public class Solution {
	static void displayPathtoPrincess(int n, String[] grid) {
		int y = 0;
		Point bot = new Point();
		Point princess = new Point();
		
		for (String string : grid) {
			
			if (string.indexOf("m") != -1)
				bot.setLocation(new Point(string.indexOf("m"), y));
			else if (string.indexOf("p") != -1)
				princess.setLocation(new Point(string.indexOf("p"), y));
			++y;
		}
		
		while (princess.x != bot.x) {
			if (princess.x < bot.x) {
				--bot.x;
				System.out.println("LEFT");
			}
			else {
				++bot.x;
				System.out.println("RIGHT");
			}
		}
		while (princess.y != bot.y) {
			if (princess.y < bot.y) {
				--bot.y;
				System.out.println("UP");
			}
			else {
				++bot.y;
				System.out.println("DOWN");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		String grid[] = new String[m];
		for (int i = 0; i < m; i++) {
			grid[i] = in.next();
		}

		displayPathtoPrincess(m, grid);
	}
}