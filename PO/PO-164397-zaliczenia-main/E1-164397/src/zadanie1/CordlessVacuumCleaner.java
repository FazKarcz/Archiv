package zadanie1;

import java.util.Date;

public class CordlessVacuumCleaner extends VacuumCleaner implements Comparable <CordlessVacuumCleaner>,Cloneable{
    private final int id;
    private Date dateOfProd = null;

    public CordlessVacuumCleaner(String name, int id) {
        super(name);
        this.id = id;
        this.dateOfProd = new Date();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID = " + id
                + ", dateOfProd = " + dateOfProd
                + "]";
    }

    @Override
    public int compareTo(CordlessVacuumCleaner o) {
        return 0;
    }

    @Override
    public CordlessVacuumCleaner clone() {
        try {
            return (CordlessVacuumCleaner) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
