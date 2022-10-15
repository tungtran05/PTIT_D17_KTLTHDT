/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangdoi;

/**
 *
 * @author Xuan Toog
 */
import java.util.*;
public class ChuSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        xuly(n);
    }
    
    static void xuly(int n) {
        Queue<String> q = new ArrayDeque<>();
        q.add("2");
        q.add("3");
        q.add("5");
        q.add("7");
        
        while(!q.isEmpty()) {
            String s = q.poll();
            if(s.length() > n)
                break;
            if(s.length()>=4 && s.contains("2") && s.contains("3") && s.contains("5") && s.contains("7") 
                    && Integer.parseInt(s) % 2 != 0) {
                System.out.println(s);
            }
            
            q.add(s + "2");
            q.add(s + "3");
            q.add(s + "5");
            q.add(s + "7");
        }
    }
}
