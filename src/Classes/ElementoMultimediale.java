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

    public void createElement(String type){
        switch (type){
            case "immagine":
                String immagineTitle;
                int imgBrightness;
                System.out.println("Inserisci titolo immagine:");
                immagineTitle=scan.nextLine();
                imgBrightness=scan.nextInt();
                new Immagine(immagineTitle, imgBrightness);
                System.out.println("Immagine creata");

            case "video":
                String videoTitle;
                int videoBright;
                int volume;
                System.out.println("Inserisci titolo del video:");
                videoTitle=scan.nextLine();
                System.out.println("inserisci una luminosita da 1 a 10");
                videoBright=scan.nextInt();
                System.out.println("inserisci un volume da 1 a 10");
                volume=scan.nextInt();
                new Video(videoTitle,videoBright,volume);
                System.out.println("Video Creato");
        }
    }


}
