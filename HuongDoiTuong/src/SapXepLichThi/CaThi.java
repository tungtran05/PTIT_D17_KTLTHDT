package SapXepLichThi;

public class CaThi {
  private String ma;
  private String ngayThi;
  private String gioThi;
  private String phongThi;

  public CaThi(int ma, String ngayThi, String gioThi, String phongThi) {
    this.ma = "C"+String.format("%03d",ma);
    this.ngayThi = ngayThi;
    this.gioThi = gioThi;
    this.phongThi = phongThi;
  }

  public String getMa() {
    return ma;
  }

  public String getNgayThi() {
    return ngayThi;
  }

  public String getGioThi() {
    return gioThi;
  }

  public String getPhongThi() {
    return phongThi;
  }
}
