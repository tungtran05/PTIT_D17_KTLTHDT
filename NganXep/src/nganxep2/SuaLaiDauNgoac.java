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
public class SuaLaiDauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            System.out.println(tinh(s));
        }
    }
    
    static int tinh(String s) {
        Stack<Character> st = new Stack();
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                st.push(c);
            } else {
                if(st.empty()) {
                    count++;
                    st.push('(');
                } else {
                    st.pop();
                }
            }
        }
        
        return count + st.size()/2;
    }
}
