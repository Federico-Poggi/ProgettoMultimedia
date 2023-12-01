package Classes;


import java.util.Scanner;

public abstract class ElementoMultimediale{
    Scanner scan=new Scanner(System.in);
    String title;
    int brightness;

    public ElementoMultimediale(String title, int brightness) {
        this.title = title;
        this.brightness = brightness;
    }




    abstract void abbasaLuminosita();

    abstract void alzaLuminosita();

}
