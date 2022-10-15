/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefinaltest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Scanner;

public class ChiaCatDoThi {

    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[101];
    static boolean chuaxet[] = new boolean[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            for (int i = 1; i <= 100; i++) {
                dske[i] = new ArrayList();
                chuaxet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                dske[a].add(b);
                dske[b].add(a);
            }

            ArrayList<Integer> stplt = new ArrayList();
            ArrayList<Integer> a = new ArrayList();

            for (int j = 1; j <= n; j++) {

                for (int i = 1; i <= 100; i++) {
                    chuaxet[i] = true;
                }
                chuaxet[j] = false;

                int dem = 0;
                for (int i = 1; i <= n; i++) {
                    if (chuaxet[i] == true) {
                        dem++;
                        bfs(i);
                    }
                }
                stplt.add(dem);
                a.add(dem);

            }

            Collections.sort(a);
            int max = a.get(a.size() - 1);

            if (max == 1) {
                System.out.println(0);
            } else {
                for (Integer x : stplt) {
                    if (x == max) {
                        System.out.println(x);
                    }
                }
            }

        }
    }

    static void bfs(int u) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(u);
        chuaxet[u] = false;
        while (!q.isEmpty()) {
            int tmp = q.poll();
            for (Integer i : dske[tmp]) {
                if (chuaxet[i] == true) {
                    q.add(i);
                }
                chuaxet[i] = false;
            }
        }
    }
}
