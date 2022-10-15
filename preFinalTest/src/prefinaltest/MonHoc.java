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
public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten, hinhthuc;

    public MonHoc(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhthuc;
    }

    @Override
    public int compareTo(MonHoc o) {
        return ma.compareTo(o.ma);
    }
    
    
}
