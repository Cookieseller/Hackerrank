import java.util.*;

public class Solution {
       
    static void quickSort(int[] ar) {
                int p = ar[0];
        int lowerPos = 0;
        int upperPos = 0;
        int lowerTemp[] = new int[ar.length];
        int upperTemp[] = new int[ar.length];
        
        for (int n: ar) {
        	if (n < p) {
        		lowerTemp[lowerPos] = n;
        		lowerPos++;
        	} else if (n > p) {
        		upperTemp[upperPos] = n;
        		upperPos++;
        	}
        }
        int lower[] = new int[lowerPos];
        int upper[] = new int[upperPos];
        for (int i = 0; i < lowerPos; i++) lower[i] = lowerTemp[i];
        for (int i = 0; i < upperPos; i++) upper[i] = upperTemp[i];

        if (lowerPos > 1)
        	quickSort(lower);

        if (upperPos > 1)
        	quickSort(upper);
        
        for (int i = 0; i < lowerPos; i++) ar[i] = lower[i];
        for (int i = 0; i < upperPos; i++) ar[lowerPos+i+1] = upper[i];
        ar[lowerPos] = p;
        printArray(ar);            
    }
 
    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt(); 
        }
        quickSort(ar);
    }    
}