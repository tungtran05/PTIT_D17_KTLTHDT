package SapXepLichThi;

public class MonHoc {
 private String ma;
 private String tenMon;
 private String hinhThuc;

  public MonHoc(String ma, String tenMon, String hinhThuc) {
    this.ma = ma;
    this.tenMon = tenMon;
    this.hinhThuc = hinhThuc;
  }

  public String getMa() {
    return ma;
  }

  public String getTenMon() {
    return tenMon;
  }

  public String getHinhThuc() {
    return hinhThuc;
  }
}
