package day_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Person {
    private String fName;
    private String lName;
    private String identifyCard;
    private  int age;
    private double height;
    private boolean married;
    private Set<Pet> pets = new HashSet<>();

    public Person(String fName, String lName, String identifyCard, int age, double height, boolean married) {
        this.fName = fName;
        this.lName = lName;
        this.identifyCard = identifyCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.pets = new HashSet<>();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getIdentifyCard() {
        return identifyCard;
    }

    public void setIdentifyCard(String identifyCard) {
        this.identifyCard = identifyCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet){
        this.pets.add(pet);
        pet.setOwner(this);
    }

    public void presentCard(){
        System.out.println("Hello my name is "+fName+" "+lName+" and my identify card is "+identifyCard);
        System.out.println("i have "+age+" and "+height+" cm");
        System.out.println("I am "+ (married ? "married":"not married"));
        if (pets.isEmpty()){
            System.out.println("I don't have pets");
        }else{
            for (Pet pet : pets) System.out.println("- " + pet.getPetName()+", Type: "+ pet.getType()+". age: "+pet.getPetAge());
            System.out.println("I have "+pets.size()+" pet(s):");
        }
    }
}
