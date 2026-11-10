package observerPattern.youtubNotification.channel;

import observerPattern.youtubNotification.subscribers.*;
import java.util.ArrayList;


public class Channels implements Channel{

    public String channelName;

    public Channels(String channelName){
        this.channelName = channelName;
    }

    public ArrayList<Subscriber> followers = new ArrayList<Subscriber>();

    @Override 
    public void follow(Subscriber s){
        followers.add(s);
    }

    @Override 
    public void unfollow(Subscriber s){
        followers.remove(s);
    }

    @Override 
    public void notifyUsers(String videoName){
        for(Subscriber s : followers){
            s.update(this,videoName);
        }
    }

    @Override 
    public void uploadVideo(String videoName){
        notifyUsers(videoName);
    }

    
}
