package com.bytedance.ugc.glue.http;

import com.bytedance.covode.number.Covode;

public abstract class UGCSimpleRequest<T> extends UGCRequest<T> implements UGCCallback<T> {
    static {
        Covode.recordClassIndex(27952);
    }

    public UGCSimpleRequest() {
        setCallback(this);
    }
}
