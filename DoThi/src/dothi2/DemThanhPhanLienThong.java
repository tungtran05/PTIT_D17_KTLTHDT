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
public class DemThanhPhanLienThong {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[20000];
    static boolean chuaxet[] = new boolean[20000];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        for(int i=0; i<20000; i++) {
            dske[i] = new ArrayList();
            chuaxet[i] = true;
        }
        
        int a, b;
        for(int i=1; i<=m; i++) {
            a = sc.nextInt(); b = sc.nextInt();
            dske[a].add(b); dske[b].add(a);
        }
        
        for(int k=1; k<=n; k++) {
            int dem = 0;
            for(int i=0; i<20000; i++) {
                chuaxet[i] = true;
            }
            chuaxet[k] = false;
            
            for(int i=1; i<=n; i++) {
                if(chuaxet[i]) {
                    dem++;
                    bfs(i);
                }
            }
            System.out.println(dem);
        }
    }
    
    public static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u); chuaxet[u] = false;
        while(!q.isEmpty()) {
            int tmp = q.poll();
            for(Integer x : dske[tmp]) {
                if(chuaxet[x]) {
                    q.add(x); chuaxet[x] = false;
                }
            }
        }
    }
}
