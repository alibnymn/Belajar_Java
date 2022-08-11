//Operator Dasar di Java
package javadasar;

import java.util.Scanner;

public class OperatorJavaDasar {
//operator aritmatika
//    public static void main(String[] args) {
//        int angka1;
//        int angka2;
//        int hasil;
//
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.print("Input angka-1: ");
//        angka1 = keyboard.nextInt();
//        System.out.print("Input angka-2: ");
//        angka2 = keyboard.nextInt();
//
//        // penjumlahan
//        hasil = angka1 + angka2;
//        System.out.println("Hasil = " + hasil);
//
//        System.out.print("Input angka-1: ");
//        angka1 = keyboard.nextInt();
//        System.out.print("Input angka-2: ");
//        angka2 = keyboard.nextInt();
//
//        // pengurangan
//        hasil = angka1 - angka2;
//        System.out.println("Hasil = " + hasil);
//
//         System.out.print("Input angka-1: ");
//        angka1 = keyboard.nextInt();
//        System.out.print("Input angka-2: ");
//        angka2 = keyboard.nextInt();
//
//        // perkalian
//        hasil = angka1 * angka2;
//        System.out.println("Hasil = " + hasil);
//
//
//        System.out.print("Input angka-1: ");
//        angka1 = keyboard.nextInt();
//        System.out.print("Input angka-2: ");
//        angka2 = keyboard.nextInt();
//
//        // Pembagian
//        hasil = angka1 / angka2;
//        System.out.println("Hasil = " + hasil);
//
//        System.out.print("Input angka-1: ");
//        angka1 = keyboard.nextInt();
//        System.out.print("Input angka-2: ");
//        angka2 = keyboard.nextInt();
//
//        // Sisa Bagi
//        hasil = angka1 % angka2;
//        System.out.println("Hasil = " + hasil);
//
//    }
//
//}
    //operator penugasan
//     public static void main(String[] args) {
//        int a;
//        int b;
//
//        // Pengisian nilai
//        a = 5;
//        b = 10;
//
//        // penambahan
//        b += a;
//        // sekarang b = 15
//        System.out.println("Penambahan : " + b);
//
//        // pengurangan
//        b -= a;
//        // sekarang b = 10 (karena 15-5)
//        System.out.println("Pengurangan : " + b);
//
//        // perkalian
//        b *= a;
//        // sekarang b = 50 (karena 10*5)
//        System.out.println("Perkalian : " + b);
//
//        // Pembagian
//        b /= a;
//        // sekarang b=10
//        System.out.println("Pembagian : " + b);
//
//        // Sisa bagi
//        b %= a;
//        // sekarang b=0
//        System.out.println("Sisa Bagi: " + b);
//
//    }
//
//}
    //operator pembanding
//    public static void main(String[] args) {
//        int nilaiA = 12;
//        int nilaiB = 4;
//        boolean hasil;
//
//        // apakah A lebih besar dari B?
//        hasil = nilaiA > nilaiB;
//        System.out.println(hasil);
//
//        // apakah A lebih kecil dari B?
//        hasil = nilaiA < nilaiB;
//        System.out.println(hasil);
//
//        // apakah A lebih besar samadengan B?
//        hasil = nilaiA >= nilaiB;
//        System.out.println(hasil);
//
//        // apakah A lebih kecil samadengan B?
//        hasil = nilaiA <= nilaiB;
//        System.out.println(hasil);
//
//        // apakah nilai A sama dengan B?
//        hasil = nilaiA == nilaiB;
//        System.out.println(hasil);
//
//        // apakah nilai A tidak samadengan B?
//        hasil = nilaiA != nilaiB;
//        System.out.println(hasil);
//
//    }
//
//}
    //operator logika
//    public static void main(String[] args) {
//        boolean a = true;
//        boolean b = false;
//        boolean c;
//        
//        //konjungsi (dan)
//        c = a && b;
//        System.out.println("true && false = "+c);
//        
//        //disjungsi (atau)
//        c = a || b;
//        System.out.println("true || false = "+c);
//        
//        //negasi (bukan)
//        System.out.println("Negasi, !true = " + !a);
//    }
//    }
  //OperatorBitwise
//     public static void main(String[] args) {
//        int a = 60;    /* 60 = 0011 1100 */
//        int b = 13;    /* 13 = 0000 1101 */
//        int c = 0;
//
//        c = a & b;       /* 12 = 0000 1100 */
//        System.out.println("a & b = " + c);
//
//        c = a | b;       /* 61 = 0011 1101 */
//        System.out.println("a | b = " + c);
//
//        c = a ^ b;       /* 49 = 0011 0001 */
//        System.out.println("a ^ b = " + c);
//
//        c = ~a;          /*-61 = 1100 0011 */
//        System.out.println("~a = " + c);
//
//        c = a << 2;     /* 240 = 1111 0000 */
//        System.out.println("a << 2 = " + c);
//
//        c = a >> 2;     /* 215 = 1111 */
//        System.out.println("a >> 2  = " + c);
//
//        c = a >>> 2;     /* 215 = 0000 1111 */
//        System.out.println("a >>> 2 = " + c);
//    }
//
//}
    //OperatorTernary
    public static void main(String[] args) {
    boolean suka = true;
        String jawaban;

        // menggunakan operator ternary
        jawaban = suka ? "iya" : "tidak";

        // menampilkan jawaban
        System.out.println(jawaban);

    }
}

