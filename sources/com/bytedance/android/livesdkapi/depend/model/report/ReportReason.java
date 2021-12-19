package com.bytedance.android.livesdkapi.depend.model.report;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ReportReason {
    @c(a = "reason")
    public long reasonId;
    @c(a = "reason_str")
    public String reasonStr;

    static {
        Covode.recordClassIndex(13739);
    }
}
