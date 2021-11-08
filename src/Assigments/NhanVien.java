/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments;

import java.io.Serializable;

/**
 *
 * @author nongvandat
 */
public class NhanVien implements Serializable{
    private String maNV,hoTen,email;
    private int tuoi;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String email, int tuoi, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.email = email;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
  
    
}
