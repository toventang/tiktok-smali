package com.bytedance.router.net;

import com.bytedance.covode.number.Covode;

public class NetResponse {
    public String content = "";
    public int errorCode = -1;

    static {
        Covode.recordClassIndex(26188);
    }

    public String toString() {
        return "[errorCode: " + this.errorCode + ", content:" + this.content + "]";
    }
}
