public class Eel extends Fish{
    public boolean electricCharge;

    Eel(int height,int weight,String animalType,String bloodType,boolean liveInWater,boolean hasGills,boolean electricCharge){
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;
        this.electricCharge = electricCharge;
    }
    public void showInfo(){
        System.out.println(height+" Weight: "+weight+", Animal Type: "+animalType+", Blood Type: "
                +bloodType+", Live in Water: "+liveInWater+", Has Gills "+hasGills+", Release electric charge: "+electricCharge);
    }
}
