package zadanie1;

import java.util.ArrayList;
import java.util.Date;

public class Doktorant extends Student implements Named, Cloneable, Comparable {
    private final int id;
    private Date dateOfStart = null;
    private ArrayList<Integer> points = null;

    public Doktorant(String name, int id, ArrayList<Integer> points) {
        super(name);
        this.id = id;
        this.dateOfStart = new Date();
        this.points = points;
    }
    public int getId() {
        return id;
    }
    public ArrayList<Integer> getPoints() {
        return points;
    }

    public String toString() {
        return "ID = " + id
                + ", dateOfStart = " + dateOfStart
                + ", points = " + points;
    }
/*
    public int Suma(Object o){
        Doktorant object = (Doktorant) o;
        return this.points + object.points;
    }
*/
    @Override
    public Doktorant clone() throws CloneNotSupportedException {
        Doktorant clone = (Doktorant) super.clone();
        Doktorant Date = (Doktorant) dateOfStart.clone();
        return clone;
    }

    @Override
    public int compareTo(Object o) {
        Doktorant object = (Doktorant) o;
        int result = this.getName().compareTo(object.getName());
/*       if(result == 0)
        {
            return this.points.comperTo(object.points);
         }
*/
        return result;
    }
}
