import java.util.ArrayList;

public class SistemPakar {

    // Simpan list gejaja dari looping indikator
    ArrayList<Gejala> listGejala = new ArrayList<>();

    // Inisialisasi Berapa indikator dan gejala dari pertanyaan
    int jumlahKeracunan = 5;
    int jumlahGejala = 13;

    // Inisialisasi mulai ke berapa dari array data yang dilooping
    int j = 20;

    // Inisialisasi Data
    String[] arrayIndikator = {"Buang air besar (lebih dari 2 kali)"
            , "Berak encer"
            , "Berak berdarah"
            , "Lesu dan tidak bergairah"
            , "Tidak selera makan"
            , "Merasa mual dan sering muntah (lebih dari 1 kali)"
            , "Merasa sakit di bagian perut"
            , "Tekanan darah rendah"
            , "Pusing"
            , "Pingsan"
            , "Pingsan"
            , "Suhu badan tinggi"
            , "Luka di bagian tertentu"
            , "Tidak dapat menggerakkan anggota badan tertentu"
            , "Memakan sesuatu"
            , "Memakan daging"
            , "Memakan jamur"
            , "Memakan makanan kaleng"
            , "Membeli susu"
            , "Meminum susu"
            , "Mencret"
            , "Muntah"
            , "Sakit perut"
            , "Darah rendah"
            , "Koma"
            , "Demam"
            , "Septicaemia"
            , "Lumpuh"
            , "Mencret berdarah"
            , "Makan daging"
            , "Makan jamur"
            , "Makan makanan kaleng"
            , "Minum susu"
            , "Keracunan Staphylococcus aureus"
            , "Keracunan jamur beracun"
            , "Keracunan Salmonellae"
            , "Keracunan Salmonellae"
            , "Keracunan Campylobacter"};

    public SistemPakar() {
        for (int i = 20; i < 20 + jumlahGejala; i++) {
            listGejala.add(buatGejalaDariListIndikator(i));
        }

        for (int i = 33; i < 33 + jumlahKeracunan; i++) {
            tambahKeracunan(new Keracunan(i, arrayIndikator[i]));
            tambahGejala(i, listGejala);
        }
    }

    public void tambahKeracunan(Keracunan keracunanBaru) {
        Database.getListKeracunan().add(keracunanBaru);
        int i = Database.getListKeracunan().size() - 1;
        Database.getListKeracunan().get(i).setListGejala(new ArrayList<>());
    }

    public void tambahGejala(int kodeGejala, ArrayList<Gejala> listGejalaBaru) {
        switch (kodeGejala) {
            case 33:
                int[] kodeGejalaCase33 = {20, 21, 22, 23, 29};
                buatListGejalaSpesifik(kodeGejala, kodeGejalaCase33, listGejalaBaru);
                break;
            case 34:
                int[] kodeGejalaCase34 = {20, 21, 22, 24, 30};
                buatListGejalaSpesifik(kodeGejala, kodeGejalaCase34, listGejalaBaru);
                break;
            case 35:
                int[] kodeGejalaCase35 = {20, 21, 22, 25, 26, 29};
                buatListGejalaSpesifik(kodeGejala, kodeGejalaCase35, listGejalaBaru);
                break;
            case 36:
                int[] kodeGejalaCase36 = {21, 27, 31};
                buatListGejalaSpesifik(kodeGejala, kodeGejalaCase36, listGejalaBaru);
                break;
            case 37:
                int[] kodeGejalaCase37 = {28, 22, 25, 32};
                buatListGejalaSpesifik(kodeGejala, kodeGejalaCase37, listGejalaBaru);
                break;
        }
    }

    public void buatListGejalaSpesifik(int kodeGejala, int[] kodeGejalaCase, ArrayList<Gejala> listGejalaBaru) {
        for (int i = 0; i < kodeGejalaCase.length; i++) {
            switch (kodeGejala) {
                case 33:
                    Database.getListKeracunan().get(0).getListGejala().add(listGejalaBaru.get(kodeGejalaCase[i]-20));
                    break;
                case 34:
                    Database.getListKeracunan().get(1).getListGejala().add(listGejalaBaru.get(kodeGejalaCase[i]-20));
                    break;
                case 35:
                    Database.getListKeracunan().get(2).getListGejala().add(listGejalaBaru.get(kodeGejalaCase[i]-20));
                    break;
                case 36:
                    Database.getListKeracunan().get(3).getListGejala().add(listGejalaBaru.get(kodeGejalaCase[i]-20));
                    break;
                case 37:
                    Database.getListKeracunan().get(4).getListGejala().add(listGejalaBaru.get(kodeGejalaCase[i]-20));
                    break;
            }
        }
    }


    public Gejala buatGejalaDariListIndikator(int i) {
        ArrayList<Integer> listIndikatorTemp = new ArrayList<>();
        switch (i) {
            case 20:
                listIndikatorTemp.add(1);
                listIndikatorTemp.add(2);
                listIndikatorTemp.add(4);
                listIndikatorTemp.add(5);
                break;
            case 21:
                listIndikatorTemp.add(4);
                listIndikatorTemp.add(5);
                listIndikatorTemp.add(6);
                break;
            case 22:
                listIndikatorTemp.add(4);
                listIndikatorTemp.add(7);
                break;
            case 23:
                listIndikatorTemp.add(4);
                listIndikatorTemp.add(8);
                listIndikatorTemp.add(9);
                break;
            case 24:
                listIndikatorTemp.add(8);
                listIndikatorTemp.add(10);
                break;
            case 25:
                listIndikatorTemp.add(4);
                listIndikatorTemp.add(5);
                listIndikatorTemp.add(9);
                listIndikatorTemp.add(11);
                break;
            case 26:
                listIndikatorTemp.add(4);
                listIndikatorTemp.add(8);
                listIndikatorTemp.add(11);
                listIndikatorTemp.add(12);
                break;
            case 27:
                listIndikatorTemp.add(4);
                listIndikatorTemp.add(13);
                break;
            case 28:
                listIndikatorTemp.add(1);
                listIndikatorTemp.add(2);
                listIndikatorTemp.add(3);
                listIndikatorTemp.add(4);
                listIndikatorTemp.add(5);
                break;
            case 29:
                listIndikatorTemp.add(14);
                listIndikatorTemp.add(15);
                break;
            case 30:
                listIndikatorTemp.add(14);
                listIndikatorTemp.add(16);
                break;
            case 31:
                listIndikatorTemp.add(14);
                listIndikatorTemp.add(17);
                break;
            case 32:
                listIndikatorTemp.add(18);
                listIndikatorTemp.add(19);
                break;
        }
        return new Gejala(i, arrayIndikator[i], listIndikatorTemp);
    }
}