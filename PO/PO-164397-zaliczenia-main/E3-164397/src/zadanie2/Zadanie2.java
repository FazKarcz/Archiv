package zadanie2;

import java.util.ArrayList;

public class Zadanie2 {

    public static <T> void kopiowanie(ArrayList<? super T>lista, ArrayList<T>lista2){
        //lista.addAll(lista2);
        int k = 1;
        for(int i = 0 ; i < lista2.size(); i++){
            lista.add(lista2.get(lista2.size()-k));
            k++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer>tab = new ArrayList<>();
        tab.add(1);
        tab.add(3);
        tab.add(5);
        ArrayList<Integer>tab2 = new ArrayList<>();
        tab2.add(2);
        tab2.add(4);
        tab2.add(6);
        kopiowanie(tab,tab2);
        System.out.println(tab);
        ArrayList<Float>tab3 = new ArrayList<>();
        tab3.add(4.5F);
        tab3.add(5.6F);
        ArrayList<Float>tab4 = new ArrayList<>();
        tab4.add(4F);
        tab4.add(4.9F);
        kopiowanie(tab3,tab4);
        System.out.println(tab3);
        ArrayList<String>lista = new ArrayList<>();
        lista.add("Kok");
        lista.add("non");
        ArrayList<String>lista2 = new ArrayList<>();
        lista2.add("działa?");
        lista2.add("test");
        kopiowanie(lista,lista2);
        System.out.println(lista);
    }
}
