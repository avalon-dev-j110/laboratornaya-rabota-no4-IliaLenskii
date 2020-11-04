package ru.avalon.java.dev.j10.labs.common;

import ru.avalon.java.dev.j10.labs.Person;
import java.util.Date;
import java.util.Random;

public class Personcl implements Person {
    private String name;
    private Date birthday;

    private Personcl() {}

    public Personcl(String name, Date birthday) {

        this.name = name;

        if(birthday != null)
            this.birthday = birthday;
        else
            this.birthday = this.randomBirthday();
    }

    public String getName() {
        return this.name;
    }

    public Date getBirthDate() {
        return this.birthday;
    }

    @Override
    public int compareTo(Personcl p) {
        String n1 = p.getName();
        String n2 = this.getName();
        Date d1 = p.getBirthDate();
        Date d2 = this.getBirthDate();

        int compareName = n1.compareTo(n2);
        int compareDate;

        if(compareName == 0) {

            compareDate = d1.compareTo(d2);

            if(compareDate == 0)
                return 0;

            return -(compareDate);
        }

        return -(compareName);
    }

    private Date randomBirthday() {
        Random  rnd = new Random();
        Date    dt;
        long    ms;

        // Get an Epoch value roughly between 1940 and 2010
        // -946771200000L = January 1, 1940
        // Add up to 70 years to it (using modulus on the next long)
        ms = -946771200000L + (Math.abs(rnd.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));

        return new Date(ms);
    }
}
