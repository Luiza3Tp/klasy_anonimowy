public class Deuzyna{

    public String druzyna;

    public int punkty;

    public Deuzyna(String druzyna) {
        this.druzyna = druzyna;
    }

    public Deuzyna() {

    }

    public String getDruzyna() {
        return druzyna;
    }

    public void setDruzyna(String druzyna) {
        this.druzyna = druzyna;
    }
    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public int getPunkty() {
        return punkty;
    }

    public Deuzyna(int punkty) {
        this.punkty = punkty;
    }

    public void dodajPunkt(int punkty){
        this.punkty += punkty;
    }
    @Override
    public String toString() {
        return "Deuzyna{" +
                "druzyna='" + druzyna + '\'' +
                '}';
    }
}
