package species;
import Animals.Animal;


public class Bird extends Animal{

    private boolean feathers;
    private boolean canFly;


    public Bird(){
        super(0.0d,0.0d,"bird","Warm");
        this.feathers = false;
        this.canFly = false;
    }

    public Bird(double height, double weight, String animalType, String bloodType
            , boolean feathers, boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.feathers = feathers;
        this.canFly = canFly;
    }

    public boolean getFeathers() {
        return feathers;
    }

    public boolean getCanFly() {
        return canFly;
    }



}
