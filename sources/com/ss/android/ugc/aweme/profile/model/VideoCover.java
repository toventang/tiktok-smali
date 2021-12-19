package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.io.Serializable;

public final class VideoCover implements Serializable {
    @c(a = "offset")
    private Integer offset;
    @c(a = "video")
    private Video video;
    @c(a = "video_id")
    private String videoId;

    static {
        Covode.recordClassIndex(75290);
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final Video getVideo() {
        return this.video;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setVideo(Video video2) {
        this.video = video2;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
