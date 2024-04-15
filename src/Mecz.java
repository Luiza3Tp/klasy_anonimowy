public class Mecz extends Deuzyna {

    public Mecz(String druzyna) {
        super(druzyna);
    }
    public Deuzyna deuzynaA;
    public Deuzyna deuzynaB;
    private int wynki;

    public Mecz(Deuzyna druzyna1, Deuzyna druzyna2, int i) {
        super();
    }

    public Deuzyna getDeuzynaB() {
        return deuzynaB;
    }

    public int getWynki() {
        return wynki;
    }

    public Deuzyna getDeuzynaA() {
        return deuzynaA;
    }

    public void setDeuzynaA(Deuzyna deuzynaA) {
        this.deuzynaA = deuzynaA;
    }

    public void setWynki(int wynki) {
        this.wynki = wynki;
    }

    public void setDeuzynaB(Deuzyna deuzynaB) {
        this.deuzynaB = deuzynaB;
    }

    public Mecz(String druzyna, int wynki, Deuzyna deuzynaA, Deuzyna deuzynaB) {
        super(druzyna);
        this.wynki = wynki;
        this.deuzynaA = deuzynaA;
        this.deuzynaB = deuzynaB;

        if (wynki == 0){
            deuzynaA.dodajPunkt(1);
        }else if (wynki == 1){
            deuzynaA.dodajPunkt(3);
        }else if (wynki == 2){
            deuzynaB.dodajPunkt(3);
        }
    }
    public void setWynik(int wynki) {
        this.wynki = wynki;
    }


    @Override
    public String toString() {
        return "Mecz{" +
                "wynki=" + wynki +
                '}';
    }
}
