package observerPattern.youtubNotification.channel;

import observerPattern.youtubNotification.subscribers.*;

/**
 * Channel
 */
public interface Channel {

    public void follow(Subscriber s);// whenever a user follow add to channel

    public void unfollow(Subscriber s);// whenever a user unfollow remove from channel

    public void notifyUsers(String videoName);// notify user when a video is uploaded

    public void uploadVideo(String VideoName);// upload video

}