package Homework4;

import java.util.Arrays;

public class Human {
   private String name;
   private String surname;
    private int year;
    private int iq;
   private Pet pet;

    private Family family ;
    private String[][] schedule;

    public Human(String jacob, String murphy, int year, int iq, String[][] strings, Family mFamily) {
    }


    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }


    public String toString() {
        return "Human{" +
                "name -'" + name + '\'' +
                " surname -'" + surname + '\'' +
                " year -" + year +
                " iq -" + iq +
                " schedule - " + Arrays.toString(schedule) + '}';
    }
    //Human{name='Name', surname='Surname', year=1, iq=1, schedule=[[day, task], [day_2, task_2]]}

    public Human(String name, String surname, int year) {
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
    }

    public Human() {

    }

    public Human(String name, String surname, int year, int iq,  Family family , String[][] schedule) {
        this.setName(name);
        this.setSurname(surname);
        this.setYear(year);
        this.setIq(iq);
        this.setSchedule(schedule);
        this.setFamily(family);
    }



}
