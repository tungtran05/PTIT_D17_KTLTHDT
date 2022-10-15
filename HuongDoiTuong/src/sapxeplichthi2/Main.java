/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxeplichthi2;

/**
 *
 * @author Xuan Toog
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> dsMH = new ArrayList();
        while(n-->0) {
            dsMH.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> dsCT = new ArrayList();
        for(int i=1; i<=n; i++) {
            dsCT.add(new CaThi(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        n = Integer.parseInt(sc.nextLine());
        ArrayList<LichThi> dsLT = new ArrayList();
        while(n-->0) {
            String[] s = sc.nextLine().trim().split("\\s+");
            LichThi lichThi = new LichThi();
            
            String maCT = s[0];
            for(CaThi ct : dsCT) {
                if(ct.getMa().equals(maCT)) {
                    lichThi.setCaThi(ct);
                }
            }
            
            String maMon = s[1];
            for(MonHoc mh : dsMH) {
                if(mh.getMa().equals(maMon)) {
                    lichThi.setMonHoc(mh);
                }
            }
            
            lichThi.setMaNhom(s[2]);
            lichThi.setSoSinhVien(Integer.parseInt(s[3]));
            
            dsLT.add(lichThi);
        }
        
        Collections.sort(dsLT);
        
        for(LichThi lt : dsLT) {
            System.out.println(lt);
        }
    }
}
