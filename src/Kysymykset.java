import java.util.List;

/**
 * Created by Administrator on 2.10.2017.
 */
public class Kysymykset {
    String kysymysteksti;
    List<String> vastausvaihtoehdot;
    int oikeanVaihtoehdonIndeksi;

    public Kysymykset(String kysymysteksti, List<String> vastausvaihtoehdot, int oikeanVaihtoehdonIndeksi) {
        this.kysymysteksti = kysymysteksti;
        this.vastausvaihtoehdot = vastausvaihtoehdot;
        this.oikeanVaihtoehdonIndeksi = oikeanVaihtoehdonIndeksi;
    }

    public String getKysymysteksti() {
        return kysymysteksti;
    }

    public void setKysymysteksti(String kysymysteksti) {
        this.kysymysteksti = kysymysteksti;
    }

    public List<String> getVastausvaihtoehdot() {
        return vastausvaihtoehdot;
    }

    public void setVastausvaihtoehdot(List<String> vastausvaihtoehdot) {
        this.vastausvaihtoehdot = vastausvaihtoehdot;
    }

    public int getOikeanVaihtoehdonIndeksi() {
        return oikeanVaihtoehdonIndeksi;
    }

    public void setOikeanVaihtoehdonIndeksi(int oikeanVaihtoehdonIndeksi) {
        this.oikeanVaihtoehdonIndeksi = oikeanVaihtoehdonIndeksi;
    }

}
