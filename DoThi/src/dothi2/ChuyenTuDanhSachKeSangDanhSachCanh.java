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

public class ChuyenTuDanhSachKeSangDanhSachCanh {
    static int n, m;
    static ArrayList<Integer> dske[] = new ArrayList[50];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++) {
            dske[i] = new ArrayList();
            String ke[] = sc.nextLine().trim().split(" ");
            for(String s : ke) {
                dske[i].add(Integer.parseInt(s));
            }
        }
        
        for(int i=1; i<=n; i++) {
            for(Integer tmp : dske[i]) {
                if(tmp > i) {
                    System.out.println(i + " " + tmp);
                }
            }
        }
    }
}
