package zadanie2;

import java.util.ArrayList;

public class Zadanie2 <T>{
    ArrayList<T> lista = new ArrayList<T>();
    public static <T> int max(ArrayList<T> list){
        T wynik = list.get(0);
        for(int i = 1; i < list.size(); i++) {
            if (list.get(i) == wynik) {
                wynik = list.get(i);
            }
        }
        return (int) wynik;
    }

}
