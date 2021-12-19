package com.ss.android.ugc.aweme.shortvideo.ac;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "ai_cut_id")
    private String aiCutId;
    @c(a = "video_count")
    private Integer videoCount = 0;
    @c(a = "video_cut_len_list")
    private String videoCutLenListStr;
    @c(a = "video_cut_start_time")
    private String videoCutStartTimeListStr;
    @c(a = "video_id")
    private String videoId;
    @c(a = "video_src_len_list")
    private String videoSrcLenListStr;

    static {
        Covode.recordClassIndex(82044);
    }

    public final String getAiCutId() {
        return this.aiCutId;
    }

    public final Integer getVideoCount() {
        return this.videoCount;
    }

    public final String getVideoCutLenListStr() {
        return this.videoCutLenListStr;
    }

    public final String getVideoCutStartTimeListStr() {
        return this.videoCutStartTimeListStr;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final String getVideoSrcLenListStr() {
        return this.videoSrcLenListStr;
    }

    public final void setAiCutId(String str) {
        this.aiCutId = str;
    }

    public final void setVideoCount(Integer num) {
        this.videoCount = num;
    }

    public final void setVideoCutLenListStr(String str) {
        this.videoCutLenListStr = str;
    }

    public final void setVideoCutStartTimeListStr(String str) {
        this.videoCutStartTimeListStr = str;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final void setVideoSrcLenListStr(String str) {
        this.videoSrcLenListStr = str;
    }
}
