package zadanie1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;


public class Java extends ProgrammingLanguage implements ObjectOriented, Cloneable, Comparable<Java> {
    private static LocalDate dateOfStart = null;
    private Date dateTheLatestRelease = null;
    private Vector<String> properties = null;

    {
        dateOfStart = LocalDate.of(1995, 5, 23);
    }

    public static LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public static void setDateOfStart(LocalDate dateOfStart) {
        Java.dateOfStart = dateOfStart;
    }

    public Java(boolean isObjectOriented, Vector<String> prop) {
        super(isObjectOriented);
        this.properties = prop;
        this.dateTheLatestRelease = new Date();
    }

    public Vector<String> getProperties() {
        return properties;
    }

    public String toString() {
        return "Language: " + getClass().getSimpleName()
                + ", dateOfStart = " + dateOfStart
                + ", dateTheLatestRelease = " + dateTheLatestRelease
                + ", properties = " + properties;
    }

    public Java clone() throws CloneNotSupportedException {
        Java obiekt = (Java) super.clone();
        obiekt.dateTheLatestRelease = (Date) dateTheLatestRelease.clone();
        return obiekt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Java java = (Java) o;
        return Objects.equals(dateTheLatestRelease, java.dateTheLatestRelease) && Objects.equals(properties, java.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTheLatestRelease, properties);
    }

    @Override
    public int compareTo(Java o) {
        return this.dateTheLatestRelease.compareTo(o.dateTheLatestRelease);
    }
}
