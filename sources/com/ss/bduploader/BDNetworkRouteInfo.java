package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public class BDNetworkRouteInfo {
    public String mContext;
    public int mContextType;
    public int mSpeed;

    static {
        Covode.recordClassIndex(100648);
    }

    public BDNetworkRouteInfo(String str, int i2, int i3) {
        this.mContext = str;
        this.mContextType = i2;
        this.mSpeed = i3;
    }
}
