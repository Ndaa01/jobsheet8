import java.util.Scanner;

public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilahMhs = new int[10];
        double total = 0, rata2;

        for (int i = 0; i < nilahMhs.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke "+(i+1)+" : ");
            nilahMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilahMhs.length; i++) {
            total += nilahMhs[i];
        }
        rata2 = total/nilahMhs.length;
        System.out.println("Rata - Rata Nilai Mahasiswa = " + rata2);
    }
}
