package Animals;
import species.Reptile;

public class Crocodile extends Reptile{
    public Crocodile(){
        super(0.5d,1000.0d,"Reptile","Cold",true,true,"Shelled");
    }

    public String showInfo(){
        return "=============================\n"+
                "Crocodile\n"+
                "=============================\n"+
                "Height: "+getHeight()+"\n"+
                "Weight: "+getWeight()+"\n"+
                "Animal Type: "+getAnimalType()+"\n"+
                "Blood Type: "+getBloodType()+"\n"+
                "Dry Skin: "+isDrySkin()+"\n"+
                "Back Bone: "+isBackBone()+"\n"+
                "Eggs: "+getEggs();
    }
}
