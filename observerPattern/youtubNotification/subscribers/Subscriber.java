package observerPattern.youtubNotification.subscribers;

import observerPattern.youtubNotification.channel.*;

public class Subscriber {

    String name;
    String email;

    public Subscriber(String name,String email){
        this.name = name;
        this.email = email;
    }

    public void update(Channels c,String videoName){
        System.out.println(c.channelName + " uploaded a new video named " + videoName);
    }
}
