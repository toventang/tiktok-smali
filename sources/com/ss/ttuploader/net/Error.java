package com.ss.ttuploader.net;

import com.bytedance.covode.number.Covode;

public class Error {
    int code;
    public String errStr;
    public String host;
    public String id;

    static {
        Covode.recordClassIndex(101417);
    }

    public Error(int i2, String str, String str2) {
        this.code = i2;
        this.host = str;
        this.id = str2;
    }

    public Error(int i2, String str, String str2, String str3) {
        this.code = i2;
        this.host = str;
        this.id = str2;
        this.errStr = str3;
    }
}
