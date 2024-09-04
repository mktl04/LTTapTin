/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT2;

import BT1.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ReadObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<SanPham> ds;
        try{
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds = (ArrayList<SanPham>) ois.readObject();
            ois.close();
            System.out.println("\n Da doc xong.");
            for (SanPham sp : ds)
            {
                System.out.println(sp);
            }
        }
    }
    
}
