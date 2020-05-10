import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemPakar sistemPakar = new SistemPakar();
        System.out.println("Masukkan pilihan : ");
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        input(inp);
//        System.out.println(Database.getListKeracunan().get(0).getListGejala().get(0).getListIndikator().get(0));

    }

    public static boolean input(String input){
        String[] inp = input.split(",");
        cekDiDatabase(inp);
        return false;
    }

    public static String cekDiDatabase(String[] inpBaru){
        ArrayList<Float> listTotalProsentaseKeracunan = new ArrayList<>();
        for (int i = 0; i < Database.getListKeracunan().size(); i++){ //33
            float totalProsentase = 0;
            int sizeOfListGejala = Database.getListKeracunan().get(i).getListGejala().size();
            for (int j = 0; j < sizeOfListGejala; j++){ //20
                float prosentaseTemp = 0;
                float counter = 0;
                int sizeOfListIndikator = Database.getListKeracunan().get(i).getListGejala().get(j).getListIndikator().size();
                for (int k = 0; k < sizeOfListIndikator; k++){ //1,2,4,5,...
                    int temp = Database.getListKeracunan().get(i).getListGejala().get(j).getListIndikator().get(k);
                    for (int l = 0; l < inpBaru.length; l++){ //1,2,4,5
                        int inpBaruBagian = Integer.parseInt(inpBaru[l]);
                        if (inpBaruBagian == temp){
                            counter+=1;
                        }
                    }
                }
                prosentaseTemp = (counter/(sizeOfListIndikator));
                totalProsentase+=prosentaseTemp;
            }
            listTotalProsentaseKeracunan.add(totalProsentase/(sizeOfListGejala)*100);
        }
        System.out.println(listTotalProsentaseKeracunan);
        return "Salah";
    }
}
