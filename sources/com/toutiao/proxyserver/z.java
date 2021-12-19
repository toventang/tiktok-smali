package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public final class z extends IOException {
    public int errorCode;

    static {
        Covode.recordClassIndex(103220);
    }

    public z(String str) {
        super(str);
        this.errorCode = 1;
    }

    public z(String str, int i2) {
        super(str);
        this.errorCode = i2;
    }
}
