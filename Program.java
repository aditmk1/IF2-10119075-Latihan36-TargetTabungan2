/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan36;

/**
 *
 * @author
 * NAMA     : aditiya musthafa kamil
 * KELAS    : IF-2
 * NIM      : 10119075
 * Deskripsi Program : Program ini berisi program Target Saldo Tabungan
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    
    public static void main(String[] args) {
        Tabungan tab = new Tabungan();
        tab.saldo = 3500000;
        tab.bungaBulanan = 0.08;
        tab.tampilTargetSaldo(6000000);
    }
}