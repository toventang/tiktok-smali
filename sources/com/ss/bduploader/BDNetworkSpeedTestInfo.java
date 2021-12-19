package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public class BDNetworkSpeedTestInfo {
    public String mContext;
    public int mContextType;
    public int mSpeed;

    static {
        Covode.recordClassIndex(100652);
    }

    public BDNetworkSpeedTestInfo(String str, int i2, int i3) {
        this.mContext = str;
        this.mContextType = i2;
        this.mSpeed = i3;
    }
}
