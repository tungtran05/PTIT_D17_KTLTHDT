/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangdoi;

import java.util.*;

/**
 *
 * @author Xuan Toog
 */
public class SoLocPhatDoiXungChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String kq = "";
            Queue<String> q = new ArrayDeque<String>();
            int count = 0;
            
            q.add("6"); q.add("8");
            while(count < n) {
                String tmp = q.poll();
                count++;
                
                System.out.print(tmp);
                for(int i=tmp.length()-1; i>=0; i--)
                    System.out.print(tmp.charAt(i)+"");
                
                System.out.print(" ");
                q.add(tmp + "6");
                q.add(tmp + "8");
            }
            
            System.out.println();
        }
    }
}
