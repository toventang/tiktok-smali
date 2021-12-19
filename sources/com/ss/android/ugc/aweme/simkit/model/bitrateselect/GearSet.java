package com.ss.android.ugc.aweme.simkit.model.bitrateselect;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.f.a.a.a.a.e;

public class GearSet implements e {
    @c(a = "bit_rate")
    private int bitRate;
    @c(a = "network_lower")
    private int networkLower;
    @c(a = "network_upper")
    private int networkUpper;

    static {
        Covode.recordClassIndex(87391);
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.e
    public int getBitRate() {
        return this.bitRate;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.e
    public int getNetworkLower() {
        return this.networkLower;
    }

    @Override // com.ss.android.ugc.f.a.a.a.a.e
    public int getNetworkUpper() {
        return this.networkUpper;
    }

    public String toString() {
        return "GearSet{networkUpper=" + this.networkUpper + ", networkLower=" + this.networkLower + ", bitRate=" + this.bitRate + '}';
    }

    public void setBitRate(int i2) {
        this.bitRate = i2;
    }

    public void setNetworkLower(int i2) {
        this.networkLower = i2;
    }

    public void setNetworkUpper(int i2) {
        this.networkUpper = i2;
    }
}
