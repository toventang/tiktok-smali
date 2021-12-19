package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class LongVideo implements Serializable {
    @c(a = "long_video_type")
    public int longVideoType;
    @c(a = "trailer_start_time")
    public int trailerStartTime;
    @c(a = "video")
    public Video video;
    @c(a = "video_control")
    public VideoControl videoControl;

    static {
        Covode.recordClassIndex(59417);
    }

    public int getLongVideoType() {
        return this.longVideoType;
    }

    public int getTrailerStartTime() {
        return this.trailerStartTime;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public void setLongVideoType(int i2) {
        this.longVideoType = i2;
    }

    public void setTrailerStartTime(int i2) {
        this.trailerStartTime = i2;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }

    public void setVideoControl(VideoControl videoControl2) {
        this.videoControl = videoControl2;
    }
}
