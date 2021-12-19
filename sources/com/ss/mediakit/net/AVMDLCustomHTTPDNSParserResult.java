package com.ss.mediakit.net;

import com.bytedance.covode.number.Covode;

public class AVMDLCustomHTTPDNSParserResult {
    public String mHostName;
    public String mIPList;
    public long mTTL;

    static {
        Covode.recordClassIndex(101130);
    }

    public AVMDLCustomHTTPDNSParserResult(String str, String str2, int i2) {
        this.mHostName = str;
        this.mIPList = str2;
        this.mTTL = (long) i2;
    }
}
