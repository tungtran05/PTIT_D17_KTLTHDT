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
public class DanhSachMonThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = Integer.parseInt(sc.nextLine());
        MonHoc[] ds = new MonHoc[n];
        for(int i=0; i<n; i++) {
            MonHoc mh = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds[i] = mh;
        }
        
        Arrays.sort(ds);
        
        for(int i=0; i<n; i++) {
            System.out.println(ds[i]);
        }
    }
}
