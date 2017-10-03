import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2.10.2017.
 */
public class Kysymyslista {
    List<Kysymykset> kysymyslista = new ArrayList<>();

    public List<Kysymykset> luoKysymyslista() {
        String kysymys = "Kuinka monta jalkaa kissalla on?";
        List<String> vastaukset = new ArrayList<>();
        vastaukset.add("0) yksi");
        vastaukset.add("1) viisi");
        vastaukset.add("2) nelja");
        int indeksi = 2;
        //__________________________Seuraava kysymys______
        String kysymys1 = "Monta sormea on kädessä";
        List<String> vastaukset1 = new ArrayList<>();
        vastaukset1.add("0) yksi");
        vastaukset1.add("1)viisi");
        vastaukset1.add("2) kaksi");
        int indeksi1 = 1;
        //____________________________________________________
        String kysymys2 = "Mikä päivä tänään on?";
        List<String> vastaukset2 = new ArrayList<>();
        vastaukset2.add("0) Maanantai");
        vastaukset2.add("1)tiistai");
        vastaukset2.add("2) Perjantai");
        int indeksi2 = 0;
        //____________________________________________________
        String kysymys3 = "keksi oma kysymys";
        List<String> vastaukset3 = new ArrayList<>();
        vastaukset3.add("0) yksi");
        vastaukset3.add("1)viisi");
        vastaukset3.add("2) kaksi");
        int indeksi3 = 1;
        //____________________________________________________
        String kysymys4 = "keksitkö?";
        List<String> vastaukset4 = new ArrayList<>();
        vastaukset4.add("0) yksi\n");
        vastaukset4.add("1)viisi\n");
        vastaukset4.add("2) kaksi");
        int indeksi4 = 1;
        //____________________________________________________
        String kysymys5 = "keksisitkö";
        List<String> vastaukset5 = new ArrayList<>();
        vastaukset5.add("0) yksi\n");
        vastaukset5.add("1)viisi\n");
        vastaukset5.add("2) kaksi");
        int indeksi5 = 1;
        //____________________________________________________
        String kysymys6 = "Monta sormea on kädessä";
        List<String> vastaukset6 = new ArrayList<>();
        vastaukset6.add("0) yksi\n");
        vastaukset6.add("1)viisi\n");
        vastaukset6.add("2) kaksi");
        int indeksi6 = 1;
        //____________________________________________________
        String kysymys7 = "Monta sormea on kädessä";
        List<String> vastaukset7 = new ArrayList<>();
        vastaukset7.add("0) yksi\n");
        vastaukset7.add("1)viisi\n");
        vastaukset7.add("2) kaksi");
        int indeksi7 = 1;
        //____________________________________________________
        String kysymys8 = "Monta sormea on kädessä";
        List<String> vastaukset8 = new ArrayList<>();
        vastaukset8.add("0) yksi\n");
        vastaukset8.add("1)viisi\n");
        vastaukset8.add("2) kaksi");
        int indeksi8 = 1;
        //____________________________________________________
        String kysymys9 = "Monta sormea on kädessä";
        List<String> vastaukset9 = new ArrayList<>();
        vastaukset9.add("0) yksi\n");
        vastaukset9.add("1)viisi\n");
        vastaukset9.add("2) kaksi");
        int indeksi9 = 1;
        //____________________________________________________
        String kysymys10 = "Monta sormea on kädessä";
        List<String> vastaukset10 = new ArrayList<>();
        vastaukset10.add("0) yksi\n");
        vastaukset10.add("1)viisi\n");
        vastaukset10.add("2) kaksi");
        int indeksi10 = 1;
        //____________________________________________________
        Kysymykset eka = new Kysymykset(kysymys, vastaukset, indeksi);
        Kysymykset toka = new Kysymykset(kysymys1, vastaukset1, indeksi1);
        Kysymykset kolmas = new Kysymykset(kysymys2, vastaukset2, indeksi2);
        Kysymykset neljas = new Kysymykset(kysymys3, vastaukset3, indeksi3);
        Kysymykset viides = new Kysymykset(kysymys4, vastaukset4, indeksi4);
        Kysymykset kuudes = new Kysymykset(kysymys5, vastaukset5, indeksi5);
        Kysymykset seiska = new Kysymykset(kysymys6, vastaukset6, indeksi6);
        Kysymykset kasi = new Kysymykset(kysymys7, vastaukset7, indeksi7);
        Kysymykset ysi = new Kysymykset(kysymys8, vastaukset8, indeksi8);
        Kysymykset kymppi = new Kysymykset(kysymys9, vastaukset9, indeksi9);
        Kysymykset yytoo = new Kysymykset(kysymys10, vastaukset10, indeksi10);


        kysymyslista.add(eka);
        kysymyslista.add(toka);
        kysymyslista.add(kolmas);
        kysymyslista.add(neljas);
        kysymyslista.add(viides);
        kysymyslista.add(kuudes);
        kysymyslista.add(seiska);
        kysymyslista.add(kasi);
        kysymyslista.add(ysi);
        kysymyslista.add(kymppi);
        kysymyslista.add(yytoo);
        return kysymyslista;
    }

}
