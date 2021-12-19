package com.bytedance.ies.sdk.widgets;

import com.bytedance.covode.number.Covode;

public class KVData {
    private Object data;
    private String key;

    static {
        Covode.recordClassIndex(20711);
    }

    public String getKey() {
        return this.key;
    }

    public <T> T getData() {
        T t = (T) this.data;
        if (t == null) {
            return null;
        }
        return t;
    }

    public <T> T getData(T t) {
        return (T) DataCenter.get(this.data, t);
    }

    public KVData(String str, Object obj) {
        this.key = str;
        this.data = obj;
    }
}
