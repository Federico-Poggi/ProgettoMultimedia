package Classes;

import Classes.Interface.Show;

public class Immagine extends ElementoMultimediale implements Show {
    boolean show;

    public Immagine(String title, int brightness){
        super(title, brightness);
        this.brightness= brightness;
        this.show=false;
    }

    @Override
    public void alzaLuminosita() {
            this.brightness++;
    }

    @Override
    public void abbasaLuminosita() {
            this.brightness--;
    }


    @Override
    public void show() {
        this.show=true;
    }
}
