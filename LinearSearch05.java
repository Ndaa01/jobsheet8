import java.util.Scanner;
public class LinearSearch05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen array: ");
        int jmlArray = sc.nextInt();
        int [] arrayInt = new int[jmlArray];
        int hasil = 0;

        for (int i = 0; i < jmlArray; i++) {
            System.out.print("Masukan elemen array ke- " + i + " : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukan key yang ingin dicari : ");
        int key = sc.nextInt();
        for (int i = 0; i < jmlArray; i++){
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke- " +hasil);
                break;
            } else {
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
    }
}
