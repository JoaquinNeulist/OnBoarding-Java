package day_3;

import java.util.Arrays;

public class Person {
    private String fName;
    private String lName;
    private String identifyCard;
    private  int age;
    private double height;
    private boolean married;
    private String[] petsNames;

    public Person(String fName, String lName, String identifyCard, int age, double height, boolean married, String[] petsNames) {
        this.fName = fName;
        this.lName = lName;
        this.identifyCard = identifyCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petsNames = petsNames;
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

    public String[] getPetsNames() {
        return petsNames;
    }

    public void setPetsNames(String[] petsNames) {
        this.petsNames = petsNames;
    }

    public void presentCard(){
        System.out.println("Hello my name is "+fName+" "+lName+" and my identify card is "+identifyCard);
        System.out.println("i have "+age+" and "+height+" cm");
        System.out.println("I am "+ (married ? "married":"not married"));
        if (petsNames.length > 0){
            System.out.println("I have "+petsNames.length+" pet(s):");
            for (String petName : petsNames){
                System.out.println("- "+petName);
            }
            System.out.println(" ");
        }else{
            System.out.println("I don't have pets");
        }
    }
}
