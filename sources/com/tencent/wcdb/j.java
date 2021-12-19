package com.tencent.wcdb;

import com.bytedance.covode.number.Covode;

public class j extends RuntimeException {
    static {
        Covode.recordClassIndex(103073);
    }

    public j() {
    }

    public j(String str) {
        super(str);
    }

    public j(String str, Throwable th) {
        super(str, th);
    }
}
