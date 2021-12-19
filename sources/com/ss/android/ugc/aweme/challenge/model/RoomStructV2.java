package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class RoomStructV2 implements Serializable {
    @c(a = "rawdata")
    private String rawdata = "";

    static {
        Covode.recordClassIndex(43167);
    }

    public final String getRawdata() {
        return this.rawdata;
    }

    public final void setRawdata(String str) {
        l.d(str, "");
        this.rawdata = str;
    }
}
