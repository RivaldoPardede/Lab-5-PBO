import java.util.Scanner;

public class JavaIO {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Scanner myScanner2 = new Scanner(System.in);

        System.out.print("Nama : ");
//        String nama = myScanner.next();
        String nama = myScanner2.nextLine();
        System.out.print("Umur : ");
        int umur = myScanner2.nextInt();
        System.out.print("Sudah Menikah?(true / false) : ");
        boolean isMarried = myScanner2.nextBoolean();
        System.out.println("Hello, " + nama + " . Anda berumur " + umur + " Tahun. " + " Status Menikah : " + isMarried);

    }
}
