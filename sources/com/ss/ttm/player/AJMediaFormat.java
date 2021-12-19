package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;

public class AJMediaFormat {
    public int channelCount;
    public int colorFormat;
    public int colorTrans;
    public int height;
    public int sampleRate;
    public int sliceHeight;
    public int stride;
    public int width;

    static {
        Covode.recordClassIndex(101290);
    }
}
