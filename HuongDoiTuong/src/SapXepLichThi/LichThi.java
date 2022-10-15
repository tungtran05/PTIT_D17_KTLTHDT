package SapXepLichThi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class LichThi implements Comparable<LichThi>{
  private String ngayThi;
  private String gioThi;
  private String phongThi;
  private String tenMon;
  private String nhom;
  private String soSinhVien;

  public LichThi(String ngayThi, String gioThi, String phongThi, String tenMon, String nhom,
      String soSinhVien) {
    this.ngayThi = ngayThi;
    this.gioThi = gioThi;
    this.phongThi = phongThi;
    this.tenMon = tenMon;
    this.nhom = nhom;
    this.soSinhVien = soSinhVien;
  }

  public LichThi() {
  }

  @Override
  public String toString() {
    return String.format("%s %s %s %s %s %s",ngayThi,gioThi,phongThi, tenMon,nhom,soSinhVien);
  }

  public String getNgayThi() {
    return ngayThi;
  }

  public void setNgayThi(String ngayThi) {
    this.ngayThi = ngayThi;
  }

  public String getGioThi() {
    return gioThi;
  }

  public void setGioThi(String gioThi) {
    this.gioThi = gioThi;
  }

  public String getPhongThi() {
    return phongThi;
  }

  public void setPhongThi(String phongThi) {
    this.phongThi = phongThi;
  }

  public String getTenMon() {
    return tenMon;
  }

  public void setTenMon(String tenMon) {
    this.tenMon = tenMon;
  }

  public String getNhom() {
    return nhom;
  }

  public void setNhom(String nhom) {
    this.nhom = nhom;
  }

  public String getSoSinhVien() {
    return soSinhVien;
  }

  public void setSoSinhVien(String soSinhVien) {
    this.soSinhVien = soSinhVien;
  }

  @Override
  public int compareTo(LichThi o){
    SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat formatter1=new SimpleDateFormat("hh:mm");
//    SimpleDateFormat formatter2=new SimpleDateFormat("dd/MM/yyyy hh:mm");
    try {
      if(o.ngayThi.equals(ngayThi)){
        // so sanh gio
        if(formatter1.parse(o.gioThi).after(formatter1.parse(this.gioThi))){
          return -1;
        }
      }
      else if(formatter.parse(o.ngayThi).after(formatter.parse(this.ngayThi))){
        return -1;
      }
      return 1;
//      if(formatter2.parse(o.gioThi).after(formatter2.parse(this.gioThi))){
//
//      }
    } catch (ParseException e) {
    }
    return 1;
  }
}
