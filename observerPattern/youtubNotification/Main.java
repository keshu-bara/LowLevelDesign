package observerPattern.youtubNotification;

import observerPattern.youtubNotification.channel.*;
import observerPattern.youtubNotification.subscribers.*;

public class Main {

    public static void main(String[] args) {
        
        Channels MrBeast = new Channels("MrBeast");
        Channels Tseries = new Channels("Tseries");


        Subscriber s1 = new Subscriber("Alex","alex@gmail.com");
        Subscriber s2 = new Subscriber("Bob", "bob@gmail.com");


        MrBeast.follow(s1);
        MrBeast.follow(s2);

        Tseries.follow(s1);

        MrBeast.uploadVideo(" \"Buying a island\" ");

        Tseries.uploadVideo(" \"Mil jaye jo tu song.\" ");


    }
    
}
