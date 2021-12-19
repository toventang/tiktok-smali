package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public class UserInfo {
    private final String extraInfo;
    private final String uid;

    static {
        Covode.recordClassIndex(100819);
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public String getUid() {
        return this.uid;
    }

    public UserInfo(String str, String str2) {
        this.uid = str;
        this.extraInfo = str2;
    }

    public static UserInfo create(String str, String str2) {
        return new UserInfo(str, str2);
    }
}
