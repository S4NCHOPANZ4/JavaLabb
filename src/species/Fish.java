package species;
import Animals.Animal;
public class Fish extends Animal{
    private boolean liveInWater;
    private boolean hasGills;

    public Fish(){
        super(0.5d,100d,"reptile","cold");
        this.liveInWater = true;
        this.hasGills = true;
    }
    public Fish(double height, double weight, String animalType, String bloodType
            , boolean liveInWater, boolean hasGills) {
        super(height, weight, animalType, bloodType);
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;
    }

    public boolean getLiveInWater() {
        return liveInWater;
    }

    public boolean getHasGills() {
        return hasGills;
    }
}
