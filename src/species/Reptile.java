package species;
import Animals.Animal;
public class Reptile extends Animal{
    private boolean drySkin;
    private boolean backBone;
    private String eggs;

    public Reptile(){
        super(0.0d,0.0d,"reptile","cold");
        this.drySkin = true;
        this.backBone = true;
        this.eggs = "Shelled";
    }

    public Reptile(double height, double weight, String animalType, String bloodType, boolean drySkin,
                   boolean backBone, String eggs) {
        super(height, weight, animalType, bloodType);
        this.drySkin = drySkin;
        this.backBone = backBone;
        this.eggs = eggs;
    }

    public boolean isDrySkin() {
        return drySkin;
    }

    public boolean isBackBone() {
        return backBone;
    }

    public String getEggs() {
        return eggs;
    }
}
