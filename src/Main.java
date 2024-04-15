import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
       // ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Fifi");
//        arrayList.add("Luiza");
//        arrayList.add("Patryk");
//        arrayList.add("Oskar");
//        arrayList.add("Adrian");
//        arrayList.add("Maciek");
//        arrayList.add("Stasiu");
//        arrayList.add("Kuba");
//        arrayList.add("Dymitry");
//
//
//        arrayList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        });
//        System.out.println(arrayList);
//
//        arrayList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() == o2.length()){
//                    return o1.compareTo(o2);
//                }else
//                    return o1.length() - o2.length();}
//            });
//        System.out.println(arrayList);

        Deuzyna druzyna1 = new Deuzyna("MLECZE");
        Deuzyna druzyna2 = new Deuzyna("SLONA");
        Deuzyna druzyna3 = new Deuzyna("TOKEN");

        ArrayList<String> druzyny = new ArrayList<>();
        druzyny.add("MLECZE");
        druzyny.add("SLONA");
        druzyny.add("TOKEN");
        Mecz mecz1 = new Mecz(druzyna1,druzyna2, 1);
        Mecz mecz2 = new Mecz(druzyna1,druzyna3, 2);
        Mecz mecz3 = new Mecz(druzyna3,druzyna2, 3);

        Collections.sort();

        System.out.println("posortowane druzyny");
        for (String druzyna: druzyny){
            System.out.println(druzyna);
        }
    }
}