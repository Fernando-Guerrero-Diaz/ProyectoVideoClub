package com.mycompany.videoclub;
import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;

public class VideoClub {
    
    public static void main(String[] args) throws IOException {
        CollectionManager collectionManager = new CollectionManager();
        Cliente cc = new Cliente("Test", 30000000, "Email@mail.mail");
        VideoClubFrame vc = new VideoClubFrame(collectionManager);
        vc.setTitle("VideoClub");
        vc.setLocation(0, 0);
        vc.setVisible(true);

        //VideoClubFrame menuPrincipal = new VideoClubFrame(collectionManager);
        //menuPrincipal.setVisible(true);
        //Menu.Menu2(map,listaPelícula);
    }

}
