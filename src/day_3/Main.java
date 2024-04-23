package day_3;
public class Main {
    public static void main(String[] args) {
        Person me = new Person("Joaquin", "Neulist", "123456789", 19, 1.80, false);
        Pet mila = new Pet("Mila", PetType.CAT, 3);
        Pet cory = new Pet("Cory", PetType.CAT, 4);
        Pet franchesca = new Pet("Franchesca", PetType.CAT, 14);
        me.addPet(mila);
        me.addPet(cory);
        me.addPet(franchesca);
        me.presentCard();
    }
}
