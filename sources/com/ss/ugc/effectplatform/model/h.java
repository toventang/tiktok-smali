package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;

public abstract class h<T> {
    static {
        Covode.recordClassIndex(102487);
    }

    public abstract T getResponseData();

    public abstract String getResponseMessage();

    public abstract int getStatusCode();

    public final boolean checkStatusCode() {
        if (getStatusCode() == 0) {
            return true;
        }
        return false;
    }

    public boolean checkValue() {
        if (getResponseData() != null) {
            return true;
        }
        return false;
    }
}
