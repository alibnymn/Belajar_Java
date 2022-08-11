
package javadasar;

import java.util.Scanner;
import java.util.ArrayList;

public class StrukturDataArray {
     public static void main(String[] args) {

//        // membuat array buah-buahan
//        String[] buah = new String[5];
//
//        // membuat scanner
//        Scanner scan = new Scanner(System.in);
//
//        // mengisi data ke array
//        for( int i = 0; i < buah.length; i++ ){
//            System.out.print("Buah ke-" + i + ": ");
//            buah[i] = scan.nextLine();
//        }
//
//        System.out.println("---------------------------");
//
//        // menampilkan semua isi array
//        for( String b : buah ){
//            System.out.println(b);
//        }
// Array Multi Dimensi
// Membuat Array dan Scanner
//        String[][] meja = new String[2][3];
//        Scanner scan = new Scanner(System.in);
//
//        // mengisi setiap meja
//        for(int bar = 0; bar < meja.length; bar++){
//            for(int kol = 0; kol < meja[bar].length; kol++){
//                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
//                meja[bar][kol] = scan.nextLine();
//            }
//        }
//
//        // menampilkan isi Array
//        System.out.println("-------------------------");
//        for(int bar = 0; bar < meja.length; bar++){
//            for(int kol = 0; kol < meja[bar].length; kol++){
//                System.out.format("| %s | \t", meja[bar][kol]);
//            }
//            System.out.println("");
//        }
//        System.out.println("-------------------------");
// Array List
// membuat objek array list
        ArrayList kantongAjaib = new ArrayList();

        // Mengisi kantong ajaib dengan 5 benda
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);

        // menghapus tikus dari kantong ajaib
        kantongAjaib.remove("tikus");

        // Menampilkan isi kantong ajaib
        System.out.println(kantongAjaib);

        // menampilkan banyak isi kantong ajaib
        System.out.println("Kantong ajaib berisi "+ kantongAjaib.size() +" item");
   
    }
    
}
