package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalRTCStats {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public int rtt;
    public int rxAudioKBitRate;
    public int rxBytes;
    public int rxKBitRate;
    public double rxLostrate;
    public int rxVideoKBitRate;
    public int totalDuration;
    public int txAudioKBitRate;
    public int txBytes;
    public int txKBitRate;
    public double txLostrate;
    public int txVideoKBitRate;
    public int users;

    static {
        Covode.recordClassIndex(100760);
    }

    public InternalRTCStats() {
    }

    public void reset() {
        this.totalDuration = 0;
        this.txBytes = 0;
        this.rxBytes = 0;
        this.txKBitRate = 0;
        this.rxKBitRate = 0;
        this.txAudioKBitRate = 0;
        this.rxAudioKBitRate = 0;
        this.txVideoKBitRate = 0;
        this.rxVideoKBitRate = 0;
        this.users = 0;
        this.cpuTotalUsage = 0.0d;
        this.cpuAppUsage = 0.0d;
        this.rxLostrate = 0.0d;
        this.txLostrate = 0.0d;
        this.rtt = 0;
    }

    public String toString() {
        return "RtcStats{totalDuration=" + this.totalDuration + ", txBytes=" + this.txBytes + ", rxBytes=" + this.rxBytes + ", txKBitRate=" + this.txKBitRate + ", rxKBitRate=" + this.rxKBitRate + ", txAudioKBitRate=" + this.txAudioKBitRate + ", rxAudioKBitRate=" + this.rxAudioKBitRate + ", txVideoKBitRate=" + this.txVideoKBitRate + ", rxVideoKBitRate=" + this.rxVideoKBitRate + ", users=" + this.users + ", cpuTotalUsage=" + this.cpuTotalUsage + ", cpuAppUsage=" + this.cpuAppUsage + ", txLostrate=" + this.txLostrate + ", rxLostrate=" + this.rxLostrate + ", rtt=" + this.rtt + '}';
    }

    private static InternalRTCStats create(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, double d2, double d3, int i12) {
        return new InternalRTCStats(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, d2, d3, i12);
    }

    public InternalRTCStats(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, double d2, double d3, int i12) {
        this.totalDuration = i2;
        this.txBytes = i3;
        this.rxBytes = i4;
        this.txKBitRate = i5;
        this.rxKBitRate = i6;
        this.txAudioKBitRate = i7;
        this.rxAudioKBitRate = i8;
        this.txVideoKBitRate = i9;
        this.rxVideoKBitRate = i10;
        this.users = i11;
        this.rxLostrate = d3;
        this.txLostrate = d2;
        this.rtt = i12;
    }
}
