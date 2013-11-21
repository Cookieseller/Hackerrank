import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.awt.Point;

public class Solution {
    
    static void nextMove(int n, int x, int y, String [] board) {
        
        int princessX = 0;
        int princessY = 0;
        
        int i = 0;
        for (String string : board) {
            if (string.indexOf("p") != -1) {
                princessX = i;
                princessY = string.indexOf("p");
                break;
            }
    		++i;
        }

        if (princessX < x) {
            System.out.println("UP");
        } else if (princessX > x) {
            System.out.println("DOWN");
        } else if (princessY < y) {
            System.out.println("LEFT");
        } else if (princessY > y) {
            System.out.println("RIGHT");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,x,y;
        n = in.nextInt();
        x = in.nextInt();
        y = in.nextInt();
        in.useDelimiter("\n");
        String board[] = new String[n];

        for(int i = 0; i < n; i++) {
            board[i] = in.next();
        }
        nextMove(n,x,y,board);
    }
}