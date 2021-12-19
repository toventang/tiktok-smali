package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

public class RecordingInfo {
    public String filePath;
    public int height;
    public VideoCodecType videoCodecType;
    public int width;

    static {
        Covode.recordClassIndex(100865);
    }

    public static RecordingInfo create(String str, VideoCodecType videoCodecType2, int i2, int i3) {
        return new RecordingInfo(str, videoCodecType2, i2, i3);
    }

    public RecordingInfo(String str, VideoCodecType videoCodecType2, int i2, int i3) {
        this.filePath = str;
        this.videoCodecType = videoCodecType2;
        this.width = i2;
        this.height = i3;
    }
}
