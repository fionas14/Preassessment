import java.util.Scanner;
public class preassesment01 {
    public static void main(String[] args) {
        Scanner fio = new Scanner(System.in);
         int data1 = fio.nextInt();
         int data2 = fio.nextInt();
         int data3 = fio.nextInt();
        // Cetak hasil enkripsi
        System.out.println(encrypt(data1));
        System.out.println(encrypt(data2));
        System.out.println(encrypt(data3));
    }
    public static int encrypt(int data) {
        // Mendapatkan digit-digit dari data
        int digit1 = (data / 1000 + 5) % 10;
        int digit2 = ((data / 100) % 10 + 5) % 10;
        int digit3 = ((data / 10) % 10 + 5) % 10;
        int digit4 = (data % 10 + 5) % 10;
        // Menukar digit kedua dan keempat
        int nomorTerenkripsi = digit1 * 1000 + digit4 * 100 + digit3 * 10 + digit2 * 1;
        return nomorTerenkripsi;
    }
}
