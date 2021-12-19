package com.ss.ugc.effectplatform.f;

import com.bytedance.covode.number.Covode;

public final class d extends Exception {
    private int status_code;

    static {
        Covode.recordClassIndex(102400);
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public d(int i2, String str) {
        super(str);
        this.status_code = i2;
    }
}
