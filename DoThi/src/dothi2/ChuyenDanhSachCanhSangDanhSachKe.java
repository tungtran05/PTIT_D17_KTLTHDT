/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dothi2;

/**
 *
 * @author Xuan Toog
 */
import java.util.*;

public class ChuyenDanhSachCanhSangDanhSachKe {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[1001];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        
        while(t-->0) {
            n = sc.nextInt(); m = sc.nextInt();
            for(int i=0; i<1001; i++) {
                dske[i] = new ArrayList();
            }
            int a, b;
            for(int i=1; i<=m; i++) {
                a = sc.nextInt(); b = sc.nextInt();
                dske[a].add(b); dske[b].add(a);
                set.add(a); set.add(b);
            }
            
            for(Integer i : set) {
                System.out.print(i + ":");
                for(Integer x : dske[i]) {
                    System.out.print(" " + x);
                }
                System.out.println();
            }
        }
    }
}
