import java.util.ArrayList;

public class Keracunan {

    private int kode;
    private String namaKeracunan;
    private ArrayList<Gejala> listGejala = new ArrayList<>();

    public Keracunan(int kode, String namaKeracunan){
        this.kode = kode;
        this.namaKeracunan = namaKeracunan;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getNamaKeracunan() {
        return namaKeracunan;
    }

    public void setNamaKeracunan(String namaKeracunan) {
        this.namaKeracunan = namaKeracunan;
    }

    public ArrayList<Gejala> getListGejala() {
        return listGejala;
    }

    @Override
    public String toString() {
        return "namaKeracunan='" + namaKeracunan;
    }

    public void setListGejala(ArrayList<Gejala> listGejala) {
        this.listGejala = listGejala;
    }
}
