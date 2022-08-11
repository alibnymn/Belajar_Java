/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadasar;

import java.util.Scanner;

public class PerulanganJava {
    //Counted Loop
      public static void main(String[] args){

//        for(int i=0; i <= 5; i++){
//            System.out.println("*****");
//        }
//        for(int i=0; i <= 10; i++){
//            System.out.print( i + " " );
//        }
//         for(int i = 1; i <= 20; i += 2){
//            System.out.print( i + " ");
//        }
    //Perulangan For Each
    // membuat array
//        int angka[] = {3,1,42,24,12};
//
//        // menggunakan perulangan For each untuk menampilkan angka
//        for( int x : angka ){
//            System.out.print(x + " ");
//        }
// Uncounted Loop
// Perulangan While
// membuat variabel dan scanner
//        boolean running = true;
//        int counter = 0;
//        String jawab;
//        Scanner scan = new Scanner(System.in);
//
//        while( running ) {
//            System.out.println("Apakah anda ingin keluar?");
//            System.out.print("Jawab [ya/tidak]> ");
//
//            jawab = scan.nextLine();
//
//            // cek jawabnnya, kalau ya maka berhenti mengulang
//            if( jawab.equalsIgnoreCase("ya") ){
//                running = false;
//            }
//
//            counter++;
//        }
//
//        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
// Perulangan Do/While
// membuat variabel
//        int i = 0;
//
//        do {
//            System.out.println("perulangan ke-" + i);
//            i++;
//        } while ( i <= 10);
//Perulangan Bersarang (Nested Loop)
// membuat variabel
        int x, y;

        // melakukan parulang sebnayan x dan y kali
        for (x = 0; x <= 5; x++){
            for( y = 0; y <= 3; y++){
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
        }
    }
}

