package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class DataBaseResponse {
    private String key = "";

    static {
        Covode.recordClassIndex(91984);
    }

    public final String getKey() {
        return this.key;
    }

    public final void setKey(String str) {
        l.d(str, "");
        this.key = str;
    }
}
