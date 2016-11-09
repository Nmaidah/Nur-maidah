/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Maidah
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instance
        Keluarga kg=new Keluarga();
     
    System.out.println(kg.bapak());
    System.out.println(kg.ibu());
    System.out.println(kg.anak());
    }       
}
class Keluarga{
    public String bapak(){
        return"Nama : Roqib";
    }
    public String ibu(){
        return"Nama : Anisa";
    }
    public String anak(){
        return"Nama : Icha";
    }
}