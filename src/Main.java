import Classes.ElementoMultimediale;
import Classes.Immagine;
import Classes.Video;


import javax.swing.*;
import java.util.Scanner;

public class Main{
    Scanner scan=new Scanner(System.in);
    ElementoMultimediale[] media;
    public static void main(String[] args)  {

        Scanner scanner=new Scanner(System.in);
        ElementoMultimediale[] media;
        media=new ElementoMultimediale[5];
        String immagine, video, toCreate;



        for (int i = 0; i<media.length;i++){
            {
            System.out.println("inserisci il tipo di elemento da creare: immagine o video?");
            toCreate=scanner.nextLine();
            }
            if(toCreate.equals("immagine")){
                System.out.println("inserisci il titolo:");
                String title=scanner.nextLine();
                System.out.println("Inserisci la luminosità");
                int bright=scanner.nextInt();
                media[i]=new Immagine(title,bright);
                System.out.println("Immagine creata");
            }else if(toCreate.equals("video")){
                System.out.println("inserisci il titolo:");
                String title=scanner.nextLine();
                System.out.println("Inserisci la luminosità");
                int bright=scanner.nextInt();
                System.out.println("Inserisci il volume");
                int volume=scanner.nextInt();
                media[i]=new Video(title,bright,volume);
                System.out.println("Video creato");

            }
            else{
                System.err.println("Errore tipologia non valida ritenta");
            }

        }

        System.out.println(media[2].toString());




    }
        }

