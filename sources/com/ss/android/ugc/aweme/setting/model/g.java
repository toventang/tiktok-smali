package com.ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class g implements Serializable {
    @c(a = "num")
    private Integer count = 0;

    static {
        Covode.recordClassIndex(80211);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final void setCount(Integer num) {
        this.count = num;
    }
}
