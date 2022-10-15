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
public class DauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            int dem = 0;
            Stack<Integer> st = new Stack();
            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                if(c == '(') {
                    dem++;
                    st.push(dem);
                    System.out.print(dem + " ");
                }
                if(c == ')') {
                    System.out.print(st.pop() + " ");
                }
            }
            System.out.println();
        }
    }
}
