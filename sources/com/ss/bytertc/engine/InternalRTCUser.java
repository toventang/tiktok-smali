package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class InternalRTCUser {
    public String metaData;
    public String userId;

    static {
        Covode.recordClassIndex(100761);
    }

    public String toString() {
        return "InternalRtcUser{userId='" + this.userId + '\'' + ", metaData='" + this.metaData + '\'' + '}';
    }

    public InternalRTCUser(String str, String str2) {
        this.userId = str;
        this.metaData = str2;
    }

    private static InternalRTCUser create(String str, String str2) {
        return new InternalRTCUser(str, str2);
    }
}
