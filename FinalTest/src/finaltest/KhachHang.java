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
public class KhachHang implements Comparable<KhachHang> {

    private String ma, ten, loaiHoGiaDinh;
    private int chiSoDau, chiSoCuoi, dinhMuc, tienTrongDinhMuc, tienVuotDinhMuc, thueVAT, tongTien;

    public KhachHang(int ma, String ten, String loaiHoGiaDinh, int chiSoDau, int chiSoCuoi) {
        this.ma = "KH" + String.format("%02d", ma);
        this.ten = chuanHoaTien(ten);
        this.loaiHoGiaDinh = loaiHoGiaDinh;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
        int dm = 0;
        if (loaiHoGiaDinh.equalsIgnoreCase("A")) {
            this.dinhMuc = 100;
            dm = 100;
        }
        if (loaiHoGiaDinh.equalsIgnoreCase("B")) {
            this.dinhMuc = 500;
            dm = 500;
        }
        if (loaiHoGiaDinh.equalsIgnoreCase("C")) {
            this.dinhMuc = 200;
            dm = 200;
        }
        
        int hieu = chiSoCuoi - chiSoDau;
        if (hieu < dm) {
            this.tienTrongDinhMuc = hieu * 450;
        } else {
            this.tienTrongDinhMuc = dm * 450;
        }

        
        if (hieu > dm) {
            this.tienVuotDinhMuc = (hieu - dm) * 1000;
        } else {
            this.tienVuotDinhMuc = 0;
        }

        

        this.thueVAT = (int) Math.round(this.tienVuotDinhMuc * 0.05);
        this.tongTien = this.tienTrongDinhMuc + this.tienVuotDinhMuc + this.thueVAT;
    }

    public long getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getLoaiHoGiaDinh() {
        return loaiHoGiaDinh;
    }

    public void setLoaiHoGiaDinh(String loaiHoGiaDinh) {
        this.loaiHoGiaDinh = loaiHoGiaDinh;
    }

    public long getChiSoDau() {
        return chiSoDau;
    }

    public void setChiSoDau(int chiSoDau) {
        this.chiSoDau = chiSoDau;
    }

    public long getChiSoCuoi() {
        return chiSoCuoi;
    }

    public void setChiSoCuoi(int chiSoCuoi) {
        this.chiSoCuoi = chiSoCuoi;
    }

    public long getTienTrongDinhMuc() {
        return tienTrongDinhMuc;
    }

    public void setTienTrongDinhMuc() {
        this.tienTrongDinhMuc = tinhTienTrongDinhMuc(chiSoDau, chiSoCuoi);
    }

    public long getTienVuotDinhMuc() {
        return tienVuotDinhMuc;
    }

    public void setTienVuotDinhMuc() {
        this.tienVuotDinhMuc = tinhTienVuotDinhMuc(chiSoDau, chiSoCuoi);
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    private int tinhTienTrongDinhMuc(int chiSoDau, int chiSoCuoi) {
        int res = 0;
        int hieu = chiSoCuoi - chiSoDau;
        if (this.loaiHoGiaDinh.equals("A")) {
            if (hieu < 100) {
                res = hieu * 450;
            } else {
                res = 100 * 450;
            }
        } else if (this.loaiHoGiaDinh.equals("B")) {
            if (hieu < 500) {
                res = hieu * 450;
            } else {
                res = 500 * 450;
            }
        } else if (this.loaiHoGiaDinh.equals("C")) {
            if (hieu < 200) {
                res = hieu * 450;
            } else {
                res = 200 * 450;
            }
        }

        return res;
    }

    private int tinhTienVuotDinhMuc(int chiSoDau, int chiSoCuoi) {
        int res = 0;

        int hieu = chiSoCuoi - chiSoDau;
        if (this.loaiHoGiaDinh.equals("A")) {
            if (hieu > 100) {
                res = (hieu - 100) * 1000;
            } else {
                res = 0;
            }
        } else if (this.loaiHoGiaDinh.equals("B")) {
            if (hieu > 500) {
                res = (hieu - 500) * 1000;
            } else {
                res = 0;
            }
        } else if (this.loaiHoGiaDinh.equals("C")) {
            if (hieu > 200) {
                res = (hieu - 200) * 1000;
            } else {
                res = 0;
            }
        }

        return res;
    }

    private String chuanHoaTien(String ten) {
        String s[] = ten.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < s.length; i++) {
            res += Character.toUpperCase(s[i].charAt(0)) + "" + s[i].substring(1).toLowerCase() + " ";
        }

        return res.trim();
    }

    @Override
    public int compareTo(KhachHang o) {
        int res = Integer.compare(this.tongTien, this.tongTien);

        return res;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tienTrongDinhMuc + " " + tienVuotDinhMuc
                + " " + thueVAT + " " + tongTien;
    }

}
