package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public final class z extends RuntimeException {
    private String msgDes;
    private int ret;

    static {
        Covode.recordClassIndex(99650);
    }

    public final String getMsgDes() {
        return this.msgDes;
    }

    public final int getRetCd() {
        return this.ret;
    }

    public z(int i2, String str) {
        super("VESDK exception ret: " + i2 + "msg: " + str);
        this.ret = i2;
        this.msgDes = str;
    }
}
