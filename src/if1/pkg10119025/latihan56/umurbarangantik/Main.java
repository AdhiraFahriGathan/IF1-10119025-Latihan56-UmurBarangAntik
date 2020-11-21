/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan56.umurbarangantik;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Umur Barang Antik
 */

    /**
     * @param args the command line arguments
     */
   public class Main {

    public static void main(String[] args) {
        Radio oo1 = new Radio(234);
        oo1.setName("Radio AM");
        System.out.println("Nama barang antik : " + oo1.getName());
        oo1.tampilUmur();
    }
    
}

