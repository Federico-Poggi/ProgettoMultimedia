package Classes;
import Classes.Interface.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    boolean show;

    public Immagine(String title, int brightness){
        super(title, brightness);
        this.brightness= brightness;
        this.show=false;
    }

    @Override
    public void alzaLuminosita(int brightness) {
        for (int i=0; i<=brightness; i++)
            this.brightness++;
    }

    @Override
    public void abbasaLuminosita(int brightness) {
        for(int i=0; i>=brightness;i++)
            this.brightness--;
    }

    public static boolean show(){
        return true;
    };
}
