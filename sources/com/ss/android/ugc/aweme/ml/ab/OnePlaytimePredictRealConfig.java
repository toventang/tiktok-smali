package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public final class OnePlaytimePredictRealConfig {
    @c(a = "count")
    private int count;
    @c(a = "duration")
    private int duration;
    @c(a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(70824);
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getType() {
        return this.type;
    }

    public final String toString() {
        return "Real(type=" + this.type + ", count=" + this.count + ", duration=" + this.duration + ')';
    }

    public final void setCount(int i2) {
        this.count = i2;
    }

    public final void setDuration(int i2) {
        this.duration = i2;
    }

    public final void setType(int i2) {
        this.type = i2;
    }
}
