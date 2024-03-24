public class Anjing {
    String tipeAnjing, warnaBulu, jenisKelamin;
    double berat, energi;

    public Anjing(String tipeAnjing, String warnaBulu, String jenisKelamin, double berat, double energi) {
        this.tipeAnjing = tipeAnjing;
        this.warnaBulu = warnaBulu;
        this.jenisKelamin = jenisKelamin;
        this.berat = berat;
        this.energi = energi;
    }

    public void mengciumBau() {
        System.out.println("Sniff Sniff");
    }

    private String aktivitas(double energi) {
        if (energi > 50 && energi < 100) {
            habiskanEnergi();
            return "menjaga ternak";
        } else if (energi < 50 && energi > 0) {
            habiskanEnergi();
            return "bermain dengan mainan";
        } else {
            return "tertidur tenang di alam sana :v";
        }
    }

    private void habiskanEnergi() {
        energi--;
    }


    public void kerjaAnjing(String tipeAnjing, String warnaBulu, double energi) {
        System.out.println("Anjing jenis " + tipeAnjing + " dengan warna bulu " + warnaBulu + " sedang " + aktivitas(energi));
        berat--;
    }

    public void tidur() {
        System.out.println("bbrrrr zzzzz rawwwrrr");
        energi++;
        berat++;
    }

    public double timbangBBAnjing() {
        return berat;
    }
}
