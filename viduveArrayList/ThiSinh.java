/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanhlan2lamlaimotlannua;

import java.util.Scanner;

/**
 *
 * @author SAVIN
 */
public class ThiSinh {
    private String sbd;
    private String ten;
    private float toan;
    Scanner sc = new Scanner (System.in);
    
    public ThiSinh(){
        sbd = ten = null;
        toan = 0;
    }
    public ThiSinh(String sbd ,String ten , float toan){
        this.sbd = sbd;
        this.ten= ten;
        this.toan = toan;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    public void nhaptu(){
        System.out.println("nhap vao sbd: ");
        this.sbd = sc.nextLine();
        
        System.out.println("nhap vao ten : ");
        this.ten = sc.nextLine();
        
        System.out.println("nhap vao diem toan : ");
        this.toan = sc.nextFloat();
    }
    
    public void xuat(){
        System.out.println(sbd + "      "+ten+"     "+toan+"        ");
    }
}
