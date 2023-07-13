package pl.uwm.wmii.kaz.FazKarcz;

import java.time.LocalDate;
import java.util.Objects;

public class TestSchool {
    public static void main(String[] args)
    {
        School s1 = new School("Nazwa szkoły", "ul. Wysoka",20,LocalDate.now());
        System.out.println(s1.getName());
        s1.setName("Inna nazwa szkoły");
        System.out.println(s1.getName());
        System.out.println(s1.toString());
        School s2 = new School("Nazwa szkoły", "ul. Wysoka",20,LocalDate.now());
        System.out.println(s1.equals(s2));
        System.out.println(s1.getLaunch());
    }
}
