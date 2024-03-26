/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author ahmad luqman hakim
 */
public class array {
    public static void main(String[] args) {
        String data [][] ={
            {"NAMA","\tALAMAT","\tTELEPON"},
            {"=============================="},
            {"NENG IFA","\tKEDIRI","\t\t085644666899"},
            {"CAK TOIB","\tTRENGGALLEK","\t085646668992"},
            {"CAK NAFIS","BOJONEGORO","\t085646668999"}
        };
        for (String[] data1 : data) {
            for (String data11 : data1) {
                System.out.print(data11 + " ");
            }
            System.out.println("");
        }
    }
}
