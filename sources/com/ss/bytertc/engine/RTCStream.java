package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

public class RTCStream {
    public boolean hasAudio;
    public boolean hasVideo;
    public boolean isScreen;
    public String userId;
    public List<VideoStreamDescription> videoStreamDescriptions;

    static {
        Covode.recordClassIndex(100812);
    }

    public RTCStream() {
    }

    public String toString() {
        return "RTCStream{ userId='" + this.userId + '\'' + ", isScreen=" + this.isScreen + ", hasVideo=" + this.hasVideo + ", hasAudio=" + this.hasAudio + ", videoStreamDescriptions=" + this.videoStreamDescriptions + '}';
    }

    private static RTCStream create(String str, boolean z, boolean z2, boolean z3) {
        return new RTCStream(str, z, z2, z3, null);
    }

    public RTCStream(String str, boolean z, boolean z2, boolean z3, List<VideoStreamDescription> list) {
        this.userId = str;
        this.isScreen = z;
        this.hasVideo = z2;
        this.hasAudio = z3;
        this.videoStreamDescriptions = list;
    }

    private static RTCStream createWithStreamDescriptions(String str, boolean z, boolean z2, boolean z3, VideoStreamDescription[] videoStreamDescriptionArr) {
        return new RTCStream(str, z, z2, z3, Arrays.asList(videoStreamDescriptionArr));
    }
}
