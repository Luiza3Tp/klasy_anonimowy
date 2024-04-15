import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Fifi");
        arrayList.add("Luiza");
        arrayList.add("Patryk");
        arrayList.add("Oskar");
        arrayList.add("Adrian");
        arrayList.add("Maciek");
        arrayList.add("Stasiu");
        arrayList.add("Kuba");
        arrayList.add("Dymitry");


        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(arrayList);
    }
}