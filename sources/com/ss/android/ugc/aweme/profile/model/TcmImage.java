package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class TcmImage implements Serializable {
    @c(a = "mid")
    private String mid;

    static {
        Covode.recordClassIndex(75265);
    }

    public final String getMid() {
        return this.mid;
    }

    public final void setMid(String str) {
        this.mid = str;
    }
}
