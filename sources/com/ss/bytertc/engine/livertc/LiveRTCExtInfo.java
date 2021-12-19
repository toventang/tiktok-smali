package com.ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;

public class LiveRTCExtInfo {
    public byte[] appSignature;
    public String businessId;
    public String channelId;
    public String interactId;
    public int interactIdMode;
    public int mixMaxBitrateKbps;
    public String token;
    public String userId;
    public int vendor;
    public String vendorName;

    static {
        Covode.recordClassIndex(100991);
    }

    public LiveRTCExtInfo() {
        reset();
    }

    public void reset() {
        this.token = "";
        this.vendor = 0;
        this.appSignature = null;
        this.channelId = "";
        this.userId = "";
        this.interactId = "";
        this.vendorName = "";
        this.mixMaxBitrateKbps = 0;
        this.interactIdMode = 0;
        this.businessId = "";
    }
}
