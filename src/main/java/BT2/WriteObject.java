/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT2;

import BT1.SanPham;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class WriteObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try{
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < 3; i++){
                System.out.println("Thong tin san pham thu "+ (i + 1));
                System.out.print("Nhap ma so: ");
                String maso = sc.nextLine();
                System.out.print("Nhap ten: ");
                String ten = sc.nextLine();
                System.out.print("Nhap gia: ");
                float donGia = sc.nextFloat();
                sc.nextLine();
                SanPham sp = new SanPham(maso, ten, donGia);
                ds.add(sp);
            }
            oos.writeObject(ds);
            oos.close();
            System.out.println("\n Da ghi xong.");
        }catch (Exception ex){
            System.out.println("Loi xay ra" + ex.toString());
        }
    }
    
}
