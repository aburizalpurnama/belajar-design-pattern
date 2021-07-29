package bridge.pattern;

import java.util.List;

public class HewanApp {

    public static void main(String[] args) {
//        manual();
        usingBridgePattern();
    }


    public static void usingBridgePattern(){
        List<Hewan> hewanList = List.of(
                new Anjing(),
                new Kucing(),
                new Lele(),
                new Kepiting(),
                new Koi(),
                new Ayam(),
                new Jenglot());

        hewanList.forEach(hewan -> {
            if (hewan instanceof HewanDarat){
                HewanDarat hewanDarat = (HewanDarat) hewan;
                System.out.println(hewanDarat.getNama() + " adalah hewan darat berkaki " + hewanDarat.getJmlKaki());
            } else if (hewan instanceof HewanAir){
                HewanAir hewanAir = (HewanAir) hewan;
                System.out.println(hewanAir.getNama() + " adalah hewan air dengan sirip sejumlah " + hewanAir.getJmlSirip());
            } else if (hewan instanceof HewanAmfibi){
                System.out.println(hewan.getNama() + " adalah amfibi");
            } else {
                System.out.println(hewan.getNama() + " adalah hewan jadi-jadian");
            }
        });
    }

    public static void manual(){
        List<Hewan> hewanList = List.of(
                new Anjing(),
                new Kucing(),
                new Lele(),
                new Kepiting(),
                new Koi(),
                new Ayam(),
                new Jenglot());

        // Harus cek instance off satu persatu
        hewanList.forEach(hewan -> {
            if (hewan.isHidupDiAir() && hewan.isHidupDiDarat()) {
                System.out.println(hewan.getNama() + " adalah amfibi");
            } else if (hewan.isHidupDiAir()) {
                if (hewan instanceof Koi){
                    Koi koi = (Koi) hewan;
                    System.out.println(koi.getNama() + " adalah hewan air dengan sirip sejumlah " + koi.getJmlSirip());
                } else if (hewan instanceof Lele){
                    Lele lele = (Lele) hewan;
                    System.out.println(lele.getNama() + " adalah hewan air dengan sirip sejumlah " + lele.getJmlSirip());
                }
            } else if (hewan.isHidupDiDarat()) {
                if (hewan instanceof Anjing){
                    Anjing anjing = (Anjing) hewan;
                    System.out.println(anjing.getNama() + " adalah hewan darat berkaki " + anjing.getJmlKaki());
                } else if (hewan instanceof Kucing){
                    Kucing kucing = (Kucing) hewan;
                    System.out.println(kucing.getNama() + " adalah hewan darat berkaki " + kucing.getJmlKaki());
                } else if (hewan instanceof Ayam){
                    Ayam ayam = (Ayam) hewan;
                    System.out.println(ayam.getNama() + " adalah hewan darat berkaki " + ayam.getJmlKaki());
                }
            } else {
                System.out.println(hewan.getNama() + " adalah hewan jadi-jadian");
            }
        });
    }
}


