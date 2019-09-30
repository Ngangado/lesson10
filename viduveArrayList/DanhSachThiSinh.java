/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanhlan2lamlaimotlannua;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author SAVIN
 */
public class DanhSachThiSinh {
    ArrayList<ThiSinh >  list = new ArrayList<ThiSinh>();
   
    Scanner sc= new Scanner (System .in);
    
    public void input(){
        
        System.out.println("nhap vao so luong thi sinh: ");
        int n = sc.nextInt();
        
        for(int i=0 ; i< n ; i++){
            ThiSinh thisinh = new ThiSinh();
             thisinh.nhaptu();
            list.add(thisinh);
           
        }
         
    }
    public void output(){
        for(int i= 0 ; i< list.size(); i++){
            list.get(i).xuat();
        }
    } 
    
    public void xoa(){
        System.out.println("nhap vao so bao danh can xoa : ");
        String sbd = sc.nextLine();
        for(int i = 0 ; i< list.size(); i++){
           if(sbd.equals(list.get(i).getSbd())  ){
               list.remove(i);
           }
        }
    
    }
    public void sưa(){
        System.out.println("nhap vao so bao danh ban muoon sua: ");
        String sbd = sc.nextLine();
        for(int i= 0; i< list.size(); i++){
            if(sbd.equals(list.get(i).getSbd()))
                list.get(i).nhaptu();
        }
        System.out.println("DANH SACH SAU KHI SUA: ");
        output();
    }
    public void them(){
        System.out.println("nhap so luong thi sinh muon them :  ");
        int n= sc.nextInt();
        for(int i= 0; i< n ; i++){
            ThiSinh ts = new ThiSinh ();
            list.add(ts);
            ts.nhaptu();
        }
        
        System.out.println("Danh sach thi sinh sua khi them : ");
        output();
    }
    public void sapxepTen(){
        Collections.sort(list, new Comparator<ThiSinh>(){
        @Override
        public int compare( ThiSinh   ts1, ThiSinh ts2){
            return (ts1.getTen().compareTo(ts2.getTen()));
        }
    });
        System.out.println("Danh sach sau khi sap xep ");
        output();
    }
    public void sapxepLy(){
        Collections.sort(list, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh ts1, ThiSinh ts2){
                if(ts1.getToan() > ts2.getToan())
                    return 1;
                else{
                    if(ts1.getToan() == ts2.getToan())
                        return 0;
                    else return -1;
                }
            }
        });
        System.out.println("Danh sach sau khi sap xep ");
        output();
    }
}
