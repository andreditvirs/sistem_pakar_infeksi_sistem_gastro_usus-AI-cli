import java.util.ArrayList;

public class Gejala {

    private int kode;
    private String namaGejala;
    ArrayList<Integer> listIndikator = new ArrayList<>();

    public Gejala(int kode, String namaGejala, ArrayList<Integer> listIndikator) {
        this.kode = kode;
        this.namaGejala = namaGejala;
        this.listIndikator = listIndikator;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getNamaGejala() {
        return namaGejala;
    }

    public void setNamaGejala(String namaGejala) {
        this.namaGejala = namaGejala;
    }

    public ArrayList<Integer> getListIndikator() {
        return listIndikator;
    }

    public void setListIndikator(ArrayList<Integer> listIndikator) {
        this.listIndikator = listIndikator;
    }

    @Override
    public String toString() {
        return "Gejala='" + namaGejala + '\'' +
                ", listGejala=" + listIndikator +
                '}';
    }
}
