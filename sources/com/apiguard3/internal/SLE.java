package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class SLE implements Serializable {
    private static final long serialVersionUID = -1908426775837684290L;
    public String id;
    public Number timeStamp;

    static {
        Covode.recordClassIndex(2532);
    }

    public SLE(String str, long j2) {
        this.id = str;
        this.timeStamp = Long.valueOf(j2);
    }
}
