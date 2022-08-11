/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProsedurDanFungsi {
 // membuat fungsi ucapSalam()
//    static void ucapSalam(){
//        System.out.println("Selamat Pagi");
//    }
//
//    // membuat fungsi main()
//    public static void main(String[] args){
//        // memanggil/eksekusi fungsi ucapSalam()
//        ucapSalam();
        
        //Fungsi dengan Parameter
//        static void ucapin(String ucapan){
//    System.out.println(ucapan);
//}
//        public static void main(String[] args){
//        // memanggil/eksekusi fungsi ucapin()
//      ucapin("Hallo!");
//      ucapin("Selamat datang di pemrograman Java");
//      ucapin("Saya kira ini bagian terakhir");
//      ucapin("Sampai jumpa lagi, ya!");
   // Fungsi yang Mengembalikan Nilai
//    static int luasPersegi(int sisi){
//    int luas = sisi * sisi;
//    return luas;
//   }
//    public static void main(String[] args){
//    System.out.println("Luas Persegi dengan panjang sisi 5 adalah " + luasPersegi(5));
//    }
    //Pemanggilan Fungsi di Fungsi Lain
//     public static void main(String[] args) {
//        int s = 12;
//        int luas = luasKubus(s);
//
//        System.out.println(luas);
//    }
//
//    // membuat fungsi luasPersegi()
//    static int luasPersegi(int sisi){
//        return sisi * sisi;
//    }
//
//    // membuat fungsi luasKubus()
//    static int luasKubus(int sisi){
//        
//        // memanggil fungsi luasPersegi
//        return 6 * luasPersegi(sisi);
//    }
    //Fungsi Static dan Non-Static
    // Fungsi non-static
//    void makan(String makanan){
//        System.out.println("Hi!");
//        System.out.println("Saya sedang makan " + makanan);
//    }
//    
//    // fungsi static
//    static void minum(String minuman){
//        System.out.println("Saya sedang minum " + minuman);
//    }
//    
//    // fungsi main
//    public static void main(String[] args) {
//        
//        // pemanggilan fungsi static
//        minum("Kopi");
//        
//        
//        // mambuat instansiasi objek saya dari class FungsiStatic
//        ProsedurDanFungsi saya = new ProsedurDanFungsi();
//        // pemanggilan fungsi non-static
//        saya.makan("Nasi Goreng");
    
    //Variabel Global dan Variabel Lokal pada Java
    // ini variabel global
//    static String nama = "Programku";
//    static String version = "1.0.0";
//
//    static void help(){
//
//        // ini variabel lokal
//        String nama = "Ali";
//
//        // mengakses variabel global di dalam fungso help()
//        System.out.println("Nama: " + nama);
//        System.out.println("Versi: " + version);
//    }
//
//    public static void main(String args[]){
//        
//        // panggil fungsi help()
//        help();
//        
//        System.out.println("Nama: " + nama);
//        System.out.println("Versi: " + version);
 /*
 * Program ini adalah program sederhana dengan fitur sebagai berikut:
1. Baca data dari ArrayList
2. Simpan data ke ArrayList
3. Ubah data
4. Hapus Data
5. Keluar
 */    
    static ArrayList listBuah = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    static void showMenu() throws IOException{
        
        System.out.println("========= MENU ========");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.print("PILIH MENU> ");
        
        int selectedMenu = Integer.valueOf(input.readLine());
        
        switch(selectedMenu){
            case 1:
                showAllBuah();
                break;
            case 2:
                insertBuah();
                break;
            case 3:
                editBuah();
                break;
            case 4:
                deleteBuah();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
                     
        }
        
        
    }

    static void showAllBuah(){
        if(listBuah.isEmpty()){
           System.out.println("Belum ada data");
        } else {
             // tampilkan semua buah
            for(int i = 0; i < listBuah.size(); i++){
                System.out.println(String.format("[%d] %s",i, listBuah.get(i)));
            }
        }
    }
    
    static void insertBuah() throws IOException{
        System.out.print("Nama buah: ");
        String namaBuah = input.readLine();
        listBuah.add(namaBuah);
    }
    
    static void editBuah() throws IOException{
        showAllBuah();
        System.out.print("Pilih nomer buah: ");
        int indexBuah = Integer.valueOf(input.readLine());
        
        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();
        
        // ubah nama buah
        listBuah.set(indexBuah, namaBaru);
    }
    
    static void deleteBuah() throws IOException{
        showAllBuah();
        System.out.print("Pilih nomer buah: ");
        int indexBuah = Integer.valueOf(input.readLine());
        // hapus buah
        listBuah.remove(indexBuah);
    }
    
    public static void main(String[] args) throws IOException {
        
        do {
            showMenu();
        } while (isRunning);
        
    }
    
}