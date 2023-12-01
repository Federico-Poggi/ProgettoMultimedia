package Classes;

import Classes.Interface.Luminosita;

public class Video extends ElementoMultimediale implements Luminosita{
    int volume=0;
    public Video(String title, int brightness, int volume) {
        super(title, brightness);
        this.volume=volume;
    }
    /*--------------------------SETVOLUME-----------------------------*/

    public void setVolume(int volume) {
        if (this.volume!=volume)
            this.volume=volume;
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

    public void play(int durata){
        for (int i=0; i<=durata; i++)
          System.out.println("Title:" + "\n" + this.title+"\n"+"Volume:\n" + this.volume+"\n"+"Brightness:\n"+ this.brightness);
    };


}


