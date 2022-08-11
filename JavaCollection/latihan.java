/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
import java.util.*;

/**
 *
 * @author Oracle-4
 */
public class latihan {
    
    public static void main(String[] args) {
    //Array 
//    ArrayList<String> al = new ArrayList<String>(); //generic
//    String[] nama = new String[]{"Ali", "Adu", "Adi"};
//    al.addAll(Arrays.asList(nama));
//    al.removeAll(al);
//    
//    Iterator it = al.iterator();
//    
//    while(it.hasNext()){
//        System.out.println(it.next());
//    }
   //Linked List 
//     LinkedList<String> ll = new LinkedList<String>();
//     ll.add("Test"); ll.add("Test");
//     ll.removeAll(ll);
//     
//     Iterator<String> itr = ll.iterator();
//     
//     if(itr.hasNext()){
//         while(itr.hasNext()){
//         System.out.println(itr.next());
//     }
//    }else{
//         System.out.println("List Kosong");
//     }

// LinkedList<String> ll = new LinkedList<String>();
//     ll.add("Test"); 
//     ll.add("Test2");
//     ll.add(1, "Test3");
//     
//     System.out.println(ll.get(0));
 // Set : HashSet, LinkedHashset, TreeSet
//   HashSet<String> nama = new HashSet<String>();
//   LinkedHashSet<String> nama = new LinkedHashSet<String>();
//     TreeSet<String> nama = new TreeSet<String>();
//   
//   nama.add("Ali"); nama.add("Endy"); nama.add("Udin");
//   
//   Iterator<String> iterator = nama.iterator();
//   
//   while(iterator.hasNext()){
//       System.out.println(iterator.next() + "");
//   }

     //Queue FIFO
//     PriorityQueue<String> nama = new PriorityQueue<String>();
//     
//     nama.add("Ali"); nama.add("Endy"); nama.add("Udin");
//     
//     System.out.println(" -- Hasil dari Peek -- " +  nama.peek());
////     System.out.println(" -- Hasil dari Poll -- " +  nama.poll());
//     
//     Iterator<String> iterator = nama.iterator();
//     
//     while(iterator.hasNext()){
//         System.out.println("Antrian Sekarang..." + iterator.next()+"");
//     }

     // Stack -LIFO- && Deuque
//     Stack<String> nama = new Stack<String>();
//     
//      nama.push("Ali"); nama.push("Endy"); nama.push("Udin");
//      
////      nama.pop();
////      nama.peek();
//
//      
//      Iterator<String> iterator = nama.iterator();
//      
//      while(iterator.hasNext()){
//         System.out.println( iterator.next()+"");
//     }
   //Map Key-value : HashMap, LinkedHashMap, TreeMap
//   HashMap<Integer, String> data = new HashMap<Integer, String>();
//   LinkedHashMap<Integer, String> data = new LinkedHashMap<Integer, String>();
     TreeMap<Integer, String> data = new TreeMap<Integer, String>();
   
   data.put(100, "Ali"); 
   data.put(200, "Adi");
   data.put(300, "Alu");
   
   //tipeData namaBaru : namaMap.entrySet()
   for(Map.Entry nama: data.entrySet()){
       System.out.println("Kunci: " + nama.getKey() + "Nilai: " + nama.getValue());
   }
      
    }   
}
