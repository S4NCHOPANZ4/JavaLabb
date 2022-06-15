import Animals.Crocodile;
import Animals.Eagle;
import Animals.Eel;

import javax.swing.text.Style;

public class Main {
    public static void main(String[] args) {

        Crocodile croc = new Crocodile();
        System.out.println(croc.showInfo());
        Eel eel = new Eel();
        System.out.println(eel.showInfo());
        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());

    }
}