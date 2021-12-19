package com.bytedance.globalpayment.iap.model;

import com.bytedance.covode.number.Covode;

public class AckStrategy {
    private long mAutoAckAfterUploadTokenInMs;
    private boolean mNeedAckAfterSuccessQuery;

    static {
        Covode.recordClassIndex(17663);
    }

    public long getAutoAckAfterUploadTokenInMs() {
        return this.mAutoAckAfterUploadTokenInMs;
    }

    public boolean isNeedAckAfterSuccessQuery() {
        return this.mNeedAckAfterSuccessQuery;
    }

    public AckStrategy setAutoAckAfterUploadTokenInMs(long j2) {
        this.mAutoAckAfterUploadTokenInMs = j2;
        return this;
    }

    public AckStrategy setNeedAckAfterSuccessQuery(boolean z) {
        this.mNeedAckAfterSuccessQuery = z;
        return this;
    }

    public AckStrategy(boolean z, long j2) {
        this.mNeedAckAfterSuccessQuery = z;
        this.mAutoAckAfterUploadTokenInMs = j2;
    }
}
