/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhio;

/**
 *
 * @author DELL
 */
public class SanPham {
    private String maso;
    private String ten;
    private double donGia;
    
    public SanPham(){
        
    }
    public SanPham(String maso, String ten, double donGia){
        this.maso = maso;
        this.ten = ten;
        this.donGia = donGia;
    }
    public String getMaso(){
        return maso;
    }
    public void setMaso(String maso){
        this.maso = maso;
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public double getDonGia(){
        return donGia;
    }
    public void setDonGia(double donGia){
        this.donGia = donGia;
    }
    @Override
    public String toString() {
        return "SanPham{" + "maso=" + maso + ", ten=" + ten + ", donGia=" + donGia + '}';
    }
    
}
