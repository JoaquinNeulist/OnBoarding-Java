package day_3;

public class Pet {
    private String petName;
    private PetType type;
    private int petAge;
    private Person owner;

    public Pet(String petName, PetType type, int petAge) {
        this.petName = petName;
        this.type = type;
        this.petAge = petAge;
    }

    public String getPetName() {
        return petName;
    }

    public PetType getType() {
        return type;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
