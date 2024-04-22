package day_2;
public class Main {
    public static void main(String[] args) {
   String[] myPets = {"Mila", "Cory", "Fausto"};
   Person persona1 = new Person("Joaquin","Neulist","123457869",19, 1.80, false,myPets);
        persona1.presentCard();
        String[] myPets2 = {};
        Person persona2 = new Person("Andres","Ferrari","985746213",20, 1.78, true,myPets2);
        persona2.presentCard();
    }
}
