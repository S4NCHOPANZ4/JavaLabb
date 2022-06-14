import java.lang.module.FindException;

public class Eagle extends Birds{
    Eagle(int height,int weight,String animalType,String bloodType,boolean feathers,boolean canFly){
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
        this.feathers = feathers;
        this.canFly = canFly;

    }
    public void showInfo(){
        System.out.println(height+" Weight: "+weight+", Animal Type: "+animalType+", Blood Type: "
                +bloodType+", Has Feathers: "+feathers+", Can fly:  "+canFly);
    }
}
