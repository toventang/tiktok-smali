package com.bytedance.android.livesdk.verify.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class QueryZhimaStatusResponse {
    @c(a = "failed_reason")
    private String failedReason;
    @c(a = "msg")
    private String message;
    @c(a = "is_verified")
    private boolean passed;
    @c(a = "status_code")
    private int statusCode;

    static {
        Covode.recordClassIndex(13217);
    }

    public String getFailedReason() {
        return this.failedReason;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean getPassed() {
        return this.passed;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
