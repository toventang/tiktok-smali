package com.ss.android.ugc.effectmanager.common.model;

import com.bytedance.covode.number.Covode;

public class BaseNetResponse {
    public String message;
    public int status_code;

    static {
        Covode.recordClassIndex(95303);
    }

    public boolean checkValue() {
        return true;
    }

    public String toString() {
        return "BaseNetResponse{status_code=" + this.status_code + ", message='" + this.message + '\'' + '}';
    }
}
