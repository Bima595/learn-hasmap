import java.util.HashMap;
import java.util.Scanner;

public class Latihan1 {
    String nama, kelas, matkulpraktikum;
    int nim;

    public Latihan1(String nm, String kl, String mat, String nim ){
        nama = nm;
        kelas = kl;
        matkulpraktikum =mat;
        nim = nim;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Latihan1> lth = new HashMap<>();
        String input;
        Latihan1 data;

        lth.put("1",new Latihan1("Putri","3H","Struktur Data", "2028888"));
        lth.put("2",new Latihan1("Agus", "3A", "Matematika", "2020012"));

        System.out.println("Masukkan Id");
        input = in.nextLine();
        data = lth.get(input);
        if(data != null){
            System.out.println("Data Mahasiswa : " +data.nama + ", kelas : " + data.kelas + ", Mata kuliah praktikum : " + data.matkulpraktikum + ", nim : " + data.nim);
        }


    }
}