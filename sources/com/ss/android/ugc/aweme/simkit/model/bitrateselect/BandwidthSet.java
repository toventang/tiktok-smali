package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.f.a.a.a.a.b;

public class BandwidthSet implements b {
    @c(a = "bitrate")
    private double bitRate;
    @c(a = "speed")
    private double speed;

    static {
        Covode.recordClassIndex(87390);
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.b
    public double getBitrate() {
        return this.bitRate;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.b
    public double getSpeed() {
        return this.speed;
    }

    public String toString() {
        return "BandwidthSet{speed=" + this.speed + ", bitRate=" + this.bitRate + '}';
    }

    public void setBitRate(long j2) {
        this.bitRate = (double) j2;
    }

    public void setSpeed(int i2) {
        this.speed = (double) i2;
    }
}
