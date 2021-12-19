package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.k;

public class NetworkExceptionImpl extends k {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final int mCronetInternalErrorCode;
    protected final int mErrorCode;

    static {
        Covode.recordClassIndex(103476);
    }

    @Override // com.ttnet.org.chromium.net.k
    public int getCronetInternalErrorCode() {
        return this.mCronetInternalErrorCode;
    }

    @Override // com.ttnet.org.chromium.net.k
    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Override // com.ttnet.org.chromium.net.k
    public boolean immediatelyRetryable() {
        int i2 = this.mErrorCode;
        if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 8) {
            return true;
        }
        return false;
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=").append(this.mErrorCode);
        if (this.mCronetInternalErrorCode != 0) {
            sb.append(", InternalErrorCode=").append(this.mCronetInternalErrorCode);
        }
        sb.append(", Retryable=").append(immediatelyRetryable());
        return sb.toString();
    }

    public NetworkExceptionImpl(String str, int i2, int i3) {
        super(str, null);
        this.mErrorCode = i2;
        this.mCronetInternalErrorCode = i3;
    }
}
