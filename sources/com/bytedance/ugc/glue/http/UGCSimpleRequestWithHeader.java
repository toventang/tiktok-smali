package com.bytedance.ugc.glue.http;

import com.bytedance.covode.number.Covode;

public abstract class UGCSimpleRequestWithHeader<T> extends UGCRequest<T> implements UGCCallbackWithHeader<T> {
    static {
        Covode.recordClassIndex(27953);
    }

    public UGCSimpleRequestWithHeader() {
        setCallbackWithHeader(this);
    }
}
