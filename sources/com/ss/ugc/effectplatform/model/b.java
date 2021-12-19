package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;

public class b {
    public String message;
    public int status_code;

    static {
        Covode.recordClassIndex(102479);
    }

    public boolean checkValue() {
        return true;
    }

    public String toString() {
        return "BaseNetResponse{status_code=" + this.status_code + ", message='" + this.message + '\'' + '}';
    }
}
