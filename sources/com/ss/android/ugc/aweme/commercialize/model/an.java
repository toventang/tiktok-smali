package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class an implements Serializable {
    @c(a = "creative_id")
    public long creativeId;
    @c(a = "log_extra")
    public String logExtra;

    static {
        Covode.recordClassIndex(46161);
    }

    public long getCreativeId() {
        return this.creativeId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }
}
