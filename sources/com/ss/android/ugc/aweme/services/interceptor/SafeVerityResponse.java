package com.ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;

public class SafeVerityResponse {
    public int requestCode;
    public int resultCode;
    public String ticket;
    public String uid;

    static {
        Covode.recordClassIndex(79729);
    }

    public SafeVerityResponse(String str, int i2, int i3, String str2) {
        this.ticket = str;
        this.resultCode = i2;
        this.requestCode = i3;
        this.uid = str2;
    }
}
