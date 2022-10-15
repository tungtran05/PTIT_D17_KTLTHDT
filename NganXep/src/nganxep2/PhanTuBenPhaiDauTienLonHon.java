/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nganxep2;

/**
 *
 * @author Xuan Toog
 */
import java.util.*;
public class PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            xuly(a, n);
        }
    }
    
    // Ý tưởng: dùng stack để lưu phần tử lớn nhất
    public static void xuly(int[] a, int n) {
        int R[] = new int [n];
        Stack<Integer> st = new Stack();
        for(int i=n-1; i>=0; i--) {
            while(!st.empty() && st.peek()<=a[i]) st.pop();
            if(st.empty()) R[i] = -1;
            else R[i] = st.peek();
            st.push(a[i]);
        }
        
        for(int i=0; i<n; i++)
            System.out.print(R[i] + " ");
        System.out.println();
    }
}
