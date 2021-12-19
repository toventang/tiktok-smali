package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class NeedPointStruct implements Serializable {
    @c(a = "point_type")
    private int pointType;
    @c(a = "time_stamp")
    private long timeStamp;

    static {
        Covode.recordClassIndex(75242);
    }

    public final int getPointType() {
        return this.pointType;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final void setPointType(int i2) {
        this.pointType = i2;
    }

    public final void setTimeStamp(long j2) {
        this.timeStamp = j2;
    }
}
