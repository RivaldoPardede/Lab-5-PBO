import java.awt.Desktop;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        //  Membuat objek desktop
        Desktop desktop = Desktop.getDesktop();

        try {
            // Membuka github salah satu programmer terbaik 2024
            desktop.browse(new URI("https://github.com/RivaldoPardede"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //  menggunakan try-catch untuk menangani error yang mungkin terjadi,
        //  seperti URL tidak valid, atau aplikasi tidak ditemukan (jika membuka file)


        //  Sumber: https://docs.oracle.com/javase/8/docs/api/
    }
}