package com.bytedance.android.livesdk.model;

import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class WarningTag {
    @c(a = "duration")
    public Long duration;
    @c(a = "tag_source")
    public int tagSource;
    @c(a = "text")
    public b text;

    static {
        Covode.recordClassIndex(11292);
    }
}
