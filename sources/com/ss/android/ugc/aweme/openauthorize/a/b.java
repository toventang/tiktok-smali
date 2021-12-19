package com.ss.android.ugc.aweme.openauthorize.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class b implements Serializable {
    @c(a = "result_code")
    private final Integer resultCode;
    @c(a = "result_msg")
    private final String resultMsg;

    static {
        Covode.recordClassIndex(73690);
    }

    public final Integer getResultCode() {
        return this.resultCode;
    }

    public final String getResultMsg() {
        return this.resultMsg;
    }
}
