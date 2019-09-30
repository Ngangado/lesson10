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
public class DanhSachDeMo {
    public static void main(String[] args) {
        DanhSachThiSinh  ds = new  DanhSachThiSinh();
        
        System.out.println("1. nhap vao danh sach thi sinh");
        System.out.println("2.in ra danh sach thi sinh ");
        System.out.println("3.xoa");
        System.out.println("4.them sinh vien ");
        System.out.println("5. sap xep thi sinh theo ten ");
        System.out.println("6. sap xep thi sinh theo diem toan ");
        Scanner sc=new Scanner (System.in);
        int n;
        
        do{
            System.out.println("nhap vao lua chon cua ban: ");
            n = sc .nextInt();
            
            switch(n){
                case 1: ds.input();
                        break;
                case 2: ds.output();
                        break;
                case 3 :
                    ds.xoa();
                    break;
                case 4:
                    ds.them();
                    break;
                case 5:
                    ds.sapxepTen();
                    break;
                case 6:
                    ds.sapxepLy();
                    break;
            }
        }while(n!=6);
    }
}
