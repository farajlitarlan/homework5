package Homework4;


import java.util.Arrays;

public class Pet {
     private String species;
   private String nickName;
    private int age;
    private int trickLevel;
     private String[] habits;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }


    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public String toString() {
        return  getSpecies() + "{" +
                " nickName = '" + getNickName() + ' ' +
                " age = " + getAge() +
                " trickLevel =" + getTrickLevel() +
                " habits = " + Arrays.toString(getHabits()) +
                '}';
    }


    public Pet() {
    }


    public Pet(String species, String nickName, int age, int trickLevel, String[] habits) {
        this.setSpecies(species);
        this.setNickName(nickName);
        this.setAge(age);
        this.setTrickLevel(trickLevel);
        this.setHabits(habits);
    }

    public Pet(String species, String nickName) {
        this.setSpecies(species);
        this.setNickName(nickName);
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickName + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

}
