package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class z extends Exception {
    int code;

    static {
        Covode.recordClassIndex(21324);
    }

    z(int i2) {
        this.code = i2;
    }

    z(int i2, String str) {
        super(str);
        this.code = i2;
    }
}
