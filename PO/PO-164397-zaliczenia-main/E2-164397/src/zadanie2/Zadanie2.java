package zadanie2;

import java.util.ArrayList;
import java.util.Collections;

public class  Zadanie2{
    public static void main(String[] args){


    }
    public <T> T min(T arg1 ,T arg2,T arg3) {
        ArrayList<T>list = new ArrayList<>();
        list.add(arg1);
        list.add(arg2);
        list.add(arg3);
        T result = list.get(0);
        for(int i = 0; i < list.size(); i++)
        {
            /*
            if(result > list.get(i))
            {
                result = list.get(i);
            }
            */
        }
        return result;
    }
}
