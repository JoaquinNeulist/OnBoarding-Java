package day_2;
public class Main {
    public static void main(String[] args) {
   String[] myPets = {"Mila", "Cory", "Franchesca"};
   Person me = new Person("Joaquin","Neulist","123457869",19, 1.80, false,myPets);
        me.presentCard();
        String[] friendPets = {"Pancho", "Agatha", "Flor"};
        Person friend = new Person("Andres","Ferrari","985746213",28, 1.78, true,friendPets);
        friend.presentCard();
        String[] friend1Pets = {};
        Person friend1 = new Person("Agustin","Rodriguez","123456783",24, 1.68, false,friend1Pets);
        friend1.presentCard();
    }
}
