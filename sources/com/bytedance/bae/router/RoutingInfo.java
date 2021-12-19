package com.bytedance.bae.router;

import com.bytedance.covode.number.Covode;

public class RoutingInfo {
    private boolean mBTScoEnabled;
    private int mDefaultRouting = -1;
    private int mForceSpeakerphone = -1;

    static {
        Covode.recordClassIndex(15372);
    }

    public boolean getBTScoEnabled() {
        return this.mBTScoEnabled;
    }

    public int getDefaultRouting() {
        return this.mDefaultRouting;
    }

    public int getForceSpeakerphone() {
        return this.mForceSpeakerphone;
    }

    public void setBTScoEnabled(boolean z) {
        this.mBTScoEnabled = z;
    }

    public void setDefaultRouting(int i2) {
        this.mDefaultRouting = i2;
    }

    public void setForceSpeakerphone(int i2) {
        this.mForceSpeakerphone = i2;
    }
}
