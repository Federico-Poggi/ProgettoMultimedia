package Classes;


import Classes.Interface.Play;

public class Video extends ElementoMultimediale implements Play {
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
    public void alzaLuminosita() {
        this.brightness++;
    }

    @Override
    public void abbasaLuminosita() {
        this.brightness--;
    }


    @Override
    public void play() {

    }


}


