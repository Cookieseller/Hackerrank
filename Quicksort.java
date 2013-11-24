import java.util.*;

public class Solution {
       
    static void partition(int[] ar) {
        int p = ar[0];
        int newArPos = 0;
        int newAr[] = new int[ar.length];
        for (int n: ar) {
            if (n < p) {
                newAr[newArPos] = n;
                ++newArPos;
            }
        }
        newAr[newArPos] = p;
        ++newArPos;
        for (int n: ar) {
            if (n > p) {
                newAr[newArPos] = n;
                ++newArPos;
            }
        }
        printArray(newAr);
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
        partition(ar);
    }    
}
