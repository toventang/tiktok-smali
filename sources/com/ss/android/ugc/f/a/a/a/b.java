package com.ss.android.ugc.f.a.a.a;

import com.bytedance.covode.number.Covode;

public final class b extends Exception {
    private final int code;
    private d shiftInfo;

    static {
        Covode.recordClassIndex(95606);
    }

    public final int getCode() {
        return this.code;
    }

    public final d getShiftInfo() {
        return this.shiftInfo;
    }

    public final void setShiftInfo(d dVar) {
        this.shiftInfo = dVar;
    }

    public b(int i2, String str) {
        super(str);
        this.code = i2;
    }
}
