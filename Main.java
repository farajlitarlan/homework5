package Homework4;

public class Main {
    public static void main(String[] args) {
        Human mother= new Human("Ann" ,"Murphy",1987);
        Human father = new Human("John","Murphy", 1980);
        Pet pet = new Pet ("dog", "Cloud", 1, 8,
                new String[] {"playing","eating","walking"} );

        Family mFamily = new Family(mother,father);

        Human childg = new Human("Bella", "Murphy", 2002,
                96, new String[][]{{"sunday","reading book"}},mFamily);
        Human childb = new Human("Jacob","Murphy",2005,
                95, new String[][]{{"sunday,walking"}},mFamily);

       mFamily.setPet(pet);

        mFamily.addChild(childg);

        mFamily.addChild(childb);

        System.out.println(mFamily+"  "+mFamily.countFamily());

        mFamily.deleteChild(1);

        System.out.println(mFamily);

    }

}