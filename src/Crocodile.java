public class Crocodile extends Reptile{
    Crocodile(int height,int weight,String animalType,String bloodType,boolean drySkin,boolean backBone,String sheldedEggs){
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
        this.drySkin = drySkin;
        this.backBone = backBone;
        this.sheldedEggs = sheldedEggs;
    }
    public void showInfo(){
        System.out.println(height+" Weight: "+weight+", Animal Type: "+animalType+", Blood Type: "
                +bloodType+", Dry Skin: "+drySkin+", Back bones: "+backBone+", Shelted eggs: "+sheldedEggs);
    }
}
