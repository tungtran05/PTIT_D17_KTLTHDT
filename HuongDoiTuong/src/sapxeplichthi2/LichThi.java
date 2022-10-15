/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxeplichthi2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xuan Toog
 */
public class LichThi implements Comparable<LichThi>{
    private CaThi caThi;
    private MonHoc monHoc;
    private String maNhom;
    private int soSinhVien;

    public CaThi getCaThi() {
        return caThi;
    }

    public void setCaThi(CaThi caThi) {
        this.caThi = caThi;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }

    public void setSoSinhVien(int soSinhVien) {
        this.soSinhVien = soSinhVien;
    }

    @Override
    public int compareTo(LichThi o) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("hh:mm");
        
        try {
            if(o.getCaThi().getNgayThi().equals(this.getCaThi().getNgayThi())) {
                if(simpleDateFormat1.parse(o.getCaThi().getGioThi()).after(simpleDateFormat1.parse(this.getCaThi().getGioThi()))) {
                    return -1;
                }
            } else if(simpleDateFormat.parse(o.getCaThi().getNgayThi()).after(simpleDateFormat.parse(this.getCaThi().getNgayThi()))) {
                return -1;
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(LichThi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 1;
    }


    @Override
    public String toString() {
        return this.getCaThi().getNgayThi() + " " + this.getCaThi().getGioThi() + " " + 
                this.getCaThi().getPhongThi() + " " + this.getMonHoc().getTen() + " " + 
                this.maNhom + " " + this.soSinhVien;
    }
    
    
    
    
}
