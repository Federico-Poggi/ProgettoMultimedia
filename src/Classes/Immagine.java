package Classes;

import Classes.Interface.Show;

public class Immagine extends ElementoMultimediale implements Show {

    boolean show;

    String ast="*";
    public Immagine(String title, int brightness){
        super(title, brightness);
        this.brightness= brightness;
        this.show=false;
    }




    @Override
    public String toString() {
        return "Immagine{" + this.title +" "+ this.brightness + " " +this.show + "}";
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
        String bright=null;
        this.show=true;
        for (int i=0; i<this.brightness;i++){

            bright.concat(ast);
        }

    }
}
