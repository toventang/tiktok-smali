package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class SubChannelInfo {
    private String channelName;
    private double volumeScale;

    static {
        Covode.recordClassIndex(100814);
    }

    public String getChannelName() {
        return this.channelName;
    }

    public double getVolumeScale() {
        return this.volumeScale;
    }

    public SubChannelInfo(String str, double d2) {
        this.channelName = str;
        this.volumeScale = d2;
    }
}
