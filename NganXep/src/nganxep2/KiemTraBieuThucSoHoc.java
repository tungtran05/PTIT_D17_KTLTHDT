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
public class KiemTraBieuThucSoHoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            if(check(s)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    
    public static boolean check(String s) {
        Stack<Integer> st = new Stack();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(')
                st.push(i);
            else if(c == ')') {
                int j = st.peek(); st.pop();
                if(i-j==2) return true;
                if(s.charAt(i-1) == ')' && s.charAt(j+1) == '(') return true;
            }
        }
        
        return false;
    }
}
