/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menukar_nilai;

import javax.swing.JOptionPane;

/**
 *
 * @author ahmad luqman hakim
 */
public class menukar_nilai {
      public static void main(String[] args) {
        int data[][] = {
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };
        
        // Input indeks elemen yang ingin diubah nilai
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan baris array:"));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kolom array:"));
        
        // Input nilai baru untuk ditukar
        int nilaiBaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru:"));
        // Tukar nilai pada posisi yang ditentukan
        data[baris][kolom] = nilaiBaru;
        // Tampilkan array setelah perubahan
          for (int[] data1 : data) {
              for (int b = 0; b < data[0].length; b++) {
                  System.out.print(data1[b] + " ");
              }
              System.out.println("\n");
          }
        
        int element = 0;
          for (int[] data1 : data) {
              for (int j = 1; j < data.length; j += 2) {
                  element += data1[j];
              }
          }
     System.out.println(element);
}
}
