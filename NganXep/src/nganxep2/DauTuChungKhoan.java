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
public class DauTuChungKhoan {
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
    
    private static void xuly(int[] a, int n) {
        Stack<Integer> stack=new Stack<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          while (!stack.isEmpty() && a[i]>=a[stack.peek()]) stack.pop();
          if(stack.isEmpty()) arr[i]=-1;
          else arr[i]= stack.peek();
          stack.push(i);
        }
        for(int i=0;i<n;i++){
          System.out.print((i-arr[i])+" ");
        }
        System.out.println();
      }
}
