package Classes;

import Interface.Luminosita;

public class Immagine extends ElementoMultimediale {
    int brightness;

    public Immagine(String title, int brightness){
        super(title);
        this.brightness= brightness;
    }
}
