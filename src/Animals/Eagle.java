package Animals;

import species.Bird;

public class Eagle extends Bird {
    public Eagle(){
        super(0.2d,0.2d,"bird","Warm",true,true);
    }
    public String showInfo(){
        return "=============================\n"+
                "Eagle\n"+
                "=============================\n"+
                "Height: "+getHeight()+"\n"+
                "Weight: "+getWeight()+"\n"+
                "Animal Type: "+getAnimalType()+"\n"+
                "Blood Type: "+getBloodType()+"\n"+
                "Feathers: "+getFeathers()+"\n"+
                "Can Fly: "+getCanFly()+"\n";
    }
}
