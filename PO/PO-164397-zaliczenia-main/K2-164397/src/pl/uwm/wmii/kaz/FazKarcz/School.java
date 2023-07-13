package pl.uwm.wmii.kaz.FazKarcz;

import java.time.LocalDate;
import java.util.Objects;

public class School {

    private String name;
    protected String address;
    private int students;
    private LocalDate launch;

    public School(String name, String address, int students, LocalDate launch)
    {
        if (Objects.equals(name, ""))
        {
            this.name = "Wydział Matematyki i Informatyki UWM";
        }
        else
        {
            this.name = name;
        }
        if(Objects.equals(address, ""))
        {
            this.address = "ul. Słoneczna 54, 10-710 Olsztyn";
        }
        else
        {
            this.address = address;
        }
        if(students < 0)
        {
            this.students = 50;
        }
        else
        {
            this.students = students;
        }
        if(!Objects.equals(launch, LocalDate.now()))
        {
            this.launch = LocalDate.now();
        }
        else
        {
            this.launch = launch;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Objects.equals(name, ""))
        {
            this.name = "Wydział Matematyki i Informatyki UWM";
        }
        else
        {
            this.name = name;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(Objects.equals(address, ""))
        {
            this.address = "ul. Słoneczna 54, 10-710 Olsztyn";
        }
        else
        {
            this.address = address;
        }
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        if(students < 0)
        {
            this.students = 50;
        }
        else
        {
            this.students = students;
        }
    }

    public LocalDate getLaunch() {
        return launch;
    }

    public void setLaunch(LocalDate launch) {
        if(!Objects.equals(launch, LocalDate.now()))
        {
            this.launch = LocalDate.now();
        }
        else
        {
            this.launch = launch;
        }
    }

    @Override
    public String toString()
    {
        return "Nazwa szkoły: " +this.name+","+
                "Adres szkoły: "+this.address+","+
                "Liczba studentów:"+this.students+","+
                "Data: "+this.launch+"."+
                "Nazwa klasy: School";
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(this.name, school.name);
    }

    static public void jakiLimit(School other)
    {
        int limit = 200;
        int wynik = limit - other.students;
        System.out.println(wynik);
    }
}

