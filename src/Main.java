public class Main {
    public static void main(String[] args) {
        Crocodile crocodile = new Crocodile(300,100,"Reptile",
                "Cold",true,true,"Soft");
        crocodile.showInfo();

        Eel eel = new Eel(80,3600,"Fish","Hot",true,true,
                true);
        eel.showInfo();

        Eagle eagle = new Eagle(100,6000,"Bird","Hot",
                true,true);
        eagle.showInfo();

    }
}