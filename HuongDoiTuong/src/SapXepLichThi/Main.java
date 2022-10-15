package SapXepLichThi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc=new Scanner(System.in);
//    sc=new Scanner(new File("C:\\Users\\huuhung\\Desktop\\tn_thi\\src\\input.txt"));
    int mon= Integer.parseInt(sc.nextLine());
    List<MonHoc> monHocs=new ArrayList<>();
    for(int i=0;i<mon;i++){
      monHocs.add(new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextLine()));
    }
    int soCaThi= Integer.parseInt(sc.nextLine());
    List<CaThi> caThis=new ArrayList<>();
    for(int i=0;i<soCaThi;i++){
      caThis.add(new CaThi(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine()));
    }
    int lichThi=Integer.parseInt(sc.nextLine());
    List<LichThi> lichThis=new ArrayList<>();
    for(int i=0;i<lichThi;i++){
      String[] tmp=sc.nextLine().split("\\s+");
      LichThi lichthi=new LichThi();
      lichthi.setNhom(tmp[2]);
      lichthi.setSoSinhVien(tmp[3]);
      CaThi caThi=getCaThi(caThis,tmp[0]);
      lichthi.setNgayThi(caThi.getNgayThi());
      lichthi.setGioThi(caThi.getGioThi());
      lichthi.setPhongThi(caThi.getPhongThi());
      MonHoc monHoc=getMonHoc(monHocs,tmp[1]);
      lichthi.setTenMon(monHoc.getTenMon());
      lichThis.add(lichthi);
    }
    Collections.sort(lichThis);
    for(LichThi lichThi1: lichThis){
      System.out.println(lichThi1);
    }
  }

  private static MonHoc getMonHoc(List<MonHoc> monHocs, String s) {
    for(MonHoc monHoc:monHocs){
      if(monHoc.getMa().equals(s))
        return monHoc;
    }
    return null;
  }

  private static CaThi getCaThi(List<CaThi> caThis, String s) {
    for(CaThi caThi:caThis){
      if (caThi.getMa().equals(s))
        return caThi;
    }
    return null;
  }
}
