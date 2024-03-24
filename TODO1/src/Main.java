public class Main {
    public static void main(String[] args) {
    //  Anjing 1
        Anjing americanBully = new Anjing("american bully", "cokelat", "male", 55, 48);

        americanBully.mengciumBau();
        System.out.println(americanBully.timbangBBAnjing());
        americanBully.kerjaAnjing(americanBully.tipeAnjing, americanBully.warnaBulu, americanBully.energi);
        americanBully.tidur();
        americanBully.tidur();
        System.out.println(americanBully.timbangBBAnjing());
        System.out.println();

    //  Anjing 2
        Anjing siberianHusky = new Anjing("siberian husky", "hitam putih", "male", 27, 80);
        siberianHusky.mengciumBau();
        System.out.println(siberianHusky.energi);
        siberianHusky.kerjaAnjing(siberianHusky.tipeAnjing, siberianHusky.warnaBulu, siberianHusky.energi);
        siberianHusky.kerjaAnjing(siberianHusky.tipeAnjing, siberianHusky.warnaBulu, siberianHusky.energi);
        System.out.println(siberianHusky.energi);

    //  Anjing 3
        Anjing goldenRetriever = new Anjing("golden retriever", "kuning cerah", "male", 30, 45);
        goldenRetriever.mengciumBau();
        System.out.println(goldenRetriever.timbangBBAnjing());
        goldenRetriever.kerjaAnjing(goldenRetriever.tipeAnjing, goldenRetriever.warnaBulu, goldenRetriever.energi);
        goldenRetriever.tidur();
        System.out.println(goldenRetriever.energi);
        System.out.println(goldenRetriever.timbangBBAnjing());
    }
}