package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.q;

public final class l extends q {
    private final NetworkExceptionImpl mNetworkException;
    private final int mQuicDetailedErrorCode;

    static {
        Covode.recordClassIndex(103534);
    }

    @Override // com.ttnet.org.chromium.net.q
    public final int getQuicDetailedErrorCode() {
        return this.mQuicDetailedErrorCode;
    }

    @Override // com.ttnet.org.chromium.net.k
    public final int getCronetInternalErrorCode() {
        return this.mNetworkException.getCronetInternalErrorCode();
    }

    @Override // com.ttnet.org.chromium.net.k
    public final int getErrorCode() {
        return this.mNetworkException.getErrorCode();
    }

    @Override // com.ttnet.org.chromium.net.k
    public final boolean immediatelyRetryable() {
        return this.mNetworkException.immediatelyRetryable();
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder(this.mNetworkException.getMessage());
        sb.append(", QuicDetailedErrorCode=").append(this.mQuicDetailedErrorCode);
        return sb.toString();
    }

    public l(String str, int i2, int i3, int i4) {
        super(str);
        this.mNetworkException = new NetworkExceptionImpl(str, i2, i3);
        this.mQuicDetailedErrorCode = i4;
    }
}
