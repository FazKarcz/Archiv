package pl.uwm.wmii.kaz.FazKarcz;

import java.time.LocalDate;
import java.util.Objects;

public class University extends School {

    private String type;
    private int studies;

    public University(String name, String address, int students, LocalDate launch, String type, int studies) {
        super(name, address, students, launch);
        {
            if (Objects.equals(type, ""))
            {
                this.type = "rolniczy";
            }
            else
            {
                this.type = type;
            }
            if(studies < 0)
            {
                this.studies = 20;
            }
            else
            {
                this.studies = studies;
            }
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (Objects.equals(type, ""))
        {
            this.type = "rolniczy";
        }
        else
        {
            this.type = type;
        }
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
        if(studies < 0)
        {
            this.studies = 20;
        }
        else
        {
            this.studies = studies;
        }
    }

    @Override
    public String toString()
    {
        return super.toString()+ "Typ szkoły"+this.type+","+
                "Liczba kierunków: "+this.studies+
                "Nazwa klasy: University";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University university = (University) o;
        return Objects.equals(this.type, university.type);
    }
}
