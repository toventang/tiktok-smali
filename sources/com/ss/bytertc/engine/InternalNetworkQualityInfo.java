package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalNetworkQualityInfo {
    public double fractionLost;
    public int netWorkQuality;
    public int rtt;
    public int totalBandwidth;
    public String uid;

    static {
        Covode.recordClassIndex(100759);
    }

    public String toString() {
        return "fractionLost=" + this.fractionLost + ",rtt=" + this.rtt + ",totalBandwidth=" + this.totalBandwidth + ",netWorkQuality=" + this.netWorkQuality;
    }

    public String toString2() {
        return "uid=" + this.uid + ",fractionLost=" + this.fractionLost + ",rtt=" + this.rtt + ",totalBandwidth=" + this.totalBandwidth + ",netWorkQuality=" + this.netWorkQuality;
    }

    private static InternalNetworkQualityInfo create(double d2, int i2, int i3, int i4) {
        return new InternalNetworkQualityInfo(d2, i2, i3, i4);
    }

    public InternalNetworkQualityInfo(double d2, int i2, int i3, int i4) {
        this.uid = "";
        this.fractionLost = d2;
        this.rtt = i2;
        this.totalBandwidth = i3;
        this.netWorkQuality = i4;
    }

    private static InternalNetworkQualityInfo create2(String str, double d2, int i2, int i3, int i4) {
        return new InternalNetworkQualityInfo(str, d2, i2, i3, i4);
    }

    public InternalNetworkQualityInfo(String str, double d2, int i2, int i3, int i4) {
        this.uid = str;
        this.fractionLost = d2;
        this.rtt = i2;
        this.totalBandwidth = i3;
        this.netWorkQuality = i4;
    }
}
