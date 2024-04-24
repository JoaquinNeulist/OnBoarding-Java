package day_3;
public class Main {
    public static void main(String[] args) {
        Person me = new Person("Joaquin", "Neulist", "123456789", 19, 1.80, false);
        Pet mila = new Pet("Mila", PetType.CAT, 3);
        Pet cory = new Pet("Cory", PetType.BIRD, 4);
        Pet franchesca = new Pet("Franchesca", PetType.DOG, 14);
        me.addPet(mila);
        me.addPet(cory);
        me.addPet(franchesca);
        me.presentCard();
        Person friend = new Person("Andres", "Ferrari", "987654321", 24,1.78, true);
        friend.presentCard();
    }
}
