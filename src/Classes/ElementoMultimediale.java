package Classes;

import Classes.Interface.Luminosita;

public abstract class ElementoMultimediale implements Luminosita {
    String title;
    int brightness;

    public ElementoMultimediale(String title, int brightness) {
        this.title = title;
        this.brightness = brightness;
    }

    @Override
    public void alzaLuminosita(int brightness) {
        if (this.brightness!=brightness)
            this.brightness=brightness;

    }
    @Override
    public void abbasaLuminosita(int brightness) {
        if (this.brightness!=brightness)
            this.brightness=brightness;
    }


}
