/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefinaltest;

/**
 *
 * @author Xuan Toog
 */
import java.util.*;

public class HoanViXauKyTu {
    static int a[], n;
    static boolean b[];
    static String s;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine(); n = s.length();
        a = new int[15]; b = new boolean[15];
        hoanvi(1);
    }
    
    static void hoanvi(int i) {
        for(int j=1; j<=n; j++) {
            if(b[j]==false) {
                a[i] = j; b[j] = true;
                if(i==n) in();
                else hoanvi(i+1);
                b[j] = false;
            }
        }
    }
    
    static void in() {
        for(int i=1; i<=n; i++) {
            System.out.print(s.charAt(a[i]-1));
        }
        System.out.println();
    }
}
