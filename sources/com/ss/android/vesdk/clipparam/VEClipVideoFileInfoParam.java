package com.ss.android.vesdk.clipparam;

import com.bytedance.covode.number.Covode;

public class VEClipVideoFileInfoParam {
    public int bitrate;
    public int codec;
    public int duration;
    public int fps;
    public int height;
    public int rotation;
    public int width;

    static {
        Covode.recordClassIndex(99377);
    }

    public String toString() {
        return "";
    }
}
