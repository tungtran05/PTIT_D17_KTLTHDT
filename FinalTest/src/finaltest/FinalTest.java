/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;

/**
 *
 * @author Xuan Toog
 */
import java.util.*;

public class FinalTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<KhachHang> dsKH = new ArrayList();
        for (int i = 1; i <= n; i++) {
            String tenKH = sc.nextLine();
            String string = sc.nextLine();

            String s[] = string.trim().split(" ");
            KhachHang kh = new KhachHang(1, tenKH, s[0], Integer.parseInt(s[1]), Integer.parseInt(s[1]));
            kh.setTienVuotDinhMuc();
            kh.setTienVuotDinhMuc();
            
            
            dsKH.add(kh);
        }

        Collections.sort(dsKH);

        for (KhachHang kh : dsKH) {
            System.out.println(kh);
            System.out.println(kh.getTienVuotDinhMuc() + kh.getTienTrongDinhMuc());
            
        }

    }

}
