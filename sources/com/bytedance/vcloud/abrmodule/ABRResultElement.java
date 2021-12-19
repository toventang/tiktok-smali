package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public class ABRResultElement {
    private long bitrate;
    private int cacheTime;
    private int mediaType;
    private int seconds;
    private int useSR;

    static {
        Covode.recordClassIndex(28004);
    }

    public long getBitrate() {
        return this.bitrate;
    }

    public int getCacheTime() {
        return this.cacheTime;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int getUseSR() {
        return this.useSR;
    }

    public ABRResultElement(long j2, int i2, int i3, int i4) {
        this.bitrate = j2;
        this.seconds = i2;
        this.mediaType = i3;
        this.cacheTime = i4;
    }

    public ABRResultElement(long j2, int i2, int i3, int i4, int i5) {
        this.bitrate = j2;
        this.seconds = i2;
        this.mediaType = i3;
        this.cacheTime = i4;
        this.useSR = i5;
    }
}
