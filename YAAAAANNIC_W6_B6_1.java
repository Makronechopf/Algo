import java.util.LinkedList;
import java.util.List;

public class Dog {
    public String name;
    private List<String> tricks;
    private String race;
    private int age;
    private int mood;
    static private int nb_chiens;

    public Dog (String name, List<String> tricks, String race, int age){
        this.name = name;
        this.tricks = tricks;
        this.race = race;
        this.age = age;
        this.mood = 5;
        nb_chiens++;


    }


    public List<String> getTricks(){
        return tricks;
    }
    public String getRace(){
        return race;
    }
    public int getAge(){
        return age;
    }
    public int getMood(){
        return mood;
    }
    public void setTricks(List<String> tricks){
        this.tricks = tricks;
    }
    public void setRace(String race){
        this.race = race;
    }
    public void setAge (int age){
        this.age = age;
    }
    public void setMood (int mood){
        this.mood = mood;
    }
    public static int getNb_chiens() {
        return nb_chiens;
    }

    public String addTrick(String trick){
        List<String>tricks = new LinkedList<String>();
        tricks.add (trick);
        return trick;
    }

    public void leash(){
        this.mood = mood - 1;
    }
    public void eat(){
        this.mood = mood + 3;
    }
    public static char getOldest(Dog other) {
        String nomChien = other.name;
        int ageChien = other.age;
        System.out.println(nomChien + " est le chien le plus agé avec " + ageChien + " ans");
        return 0;
    }
    public String toString (){
        String nomChien = name;
        int ageChien = age;
        String raceChien = race;
        int moodChien = mood;
        List<String>tricksChien = tricks;
        return nomChien +" à " + ageChien+  " ans, est un "+raceChien + "et a un humeur de " + moodChien + "Il sait faire les tours suivants: " + tricksChien + ".";
