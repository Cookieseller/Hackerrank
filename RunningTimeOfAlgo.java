import java.util.*;

public class Solution {
    
    public static void insertionSort(int[] ar){
        int shiftCounter = 0;
        for (int i = 1; i < ar.length; i++) {
        	int j = i;
        	while (j > 0 && ar[j] < ar[j-1]) {
        		int t = ar[j];
        		ar[j] = ar[j-1];
        		ar[j-1] = t;
        		j--;
                shiftCounter++;
        	}
        }
        System.out.println(shiftCounter);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt(); 
        }
        insertionSort(ar);
    }    
}