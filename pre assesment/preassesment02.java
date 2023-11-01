import java.util.Scanner;

public class preassesment02 {
    public static void main(String[] args) {
        Scanner fio = new Scanner(System.in);

        int A = fio.nextInt();
        int B = fio.nextInt();

        hasil(A + B);
    }
    public static void hasil(int angka) {
        int digit1 = angka / 100;
        int digit2 = (angka / 10) % 10;
        int digit3 = angka % 10;

        System.out.printf("%s ratus %s puluh %s", baca(digit1) , baca(digit2) , baca(digit3));

    }
    public static String baca(int angka){
        String kata = "";
        switch (angka) {
            case 2:
            kata = "dua";
            break;
            case 3:
            kata = "tiga";
            break;
            case 4:
            kata = "empat";
            break;
            case 5:
            kata = "lima";
            break;
            case 6:
            kata = "enam";
            break;
            case 7:
            kata = "tujuh";
            break;
            case 8:
            kata = "delapan";
            break;
            case 9:
            kata = "sembilan";
            break;
        }
        return kata;
}
}