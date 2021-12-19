package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class LogPbBean implements Serializable {
    @c(a = "impr_id")
    private String imprId;

    static {
        Covode.recordClassIndex(47112);
    }

    public final String getImprId() {
        return this.imprId;
    }

    public final void setImprId(String str) {
        this.imprId = str;
    }
}
