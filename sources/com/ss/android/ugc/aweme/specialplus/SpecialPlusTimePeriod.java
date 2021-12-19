package com.ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class SpecialPlusTimePeriod {
    @c(a = "end_time")
    private String end = "";
    @c(a = "start_time")
    private String start = "";

    static {
        Covode.recordClassIndex(87970);
    }

    public final String getEnd() {
        return this.end;
    }

    public final String getStart() {
        return this.start;
    }

    public final void setEnd(String str) {
        l.d(str, "");
        this.end = str;
    }

    public final void setStart(String str) {
        l.d(str, "");
        this.start = str;
    }
}
