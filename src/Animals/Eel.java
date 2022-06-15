package Animals;

import species.Fish;

public class Eel extends Fish {

    private boolean releaseElectricCharge;
    public Eel(){
        super(0.5d,1.0d,"Fish","Warm",true,true);
        this.releaseElectricCharge = true;
    }
    public boolean isReleaseElectricCharge() {
        return releaseElectricCharge;
    }
    public String showInfo(){
        return "=============================\n"+
                "Eel\n"+
                "=============================\n"+
                "Height: "+getHeight()+"\n"+
                "Weight: "+getWeight()+"\n"+
                "Animal Type: "+getAnimalType()+"\n"+
                "Blood Type: "+getBloodType()+"\n"+
                "Live in water: "+getLiveInWater()+"\n"+
                "hasGills: "+getHasGills();
    }

}
