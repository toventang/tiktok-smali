package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;

public class a extends NetworkExceptionImpl {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155673a = true;

    static {
        Covode.recordClassIndex(103488);
    }

    @Override // com.ttnet.org.chromium.net.k, com.ttnet.org.chromium.net.impl.NetworkExceptionImpl
    public boolean immediatelyRetryable() {
        int i2 = this.mCronetInternalErrorCode;
        if (i2 != -358 && i2 != -352) {
            return super.immediatelyRetryable();
        }
        if (f155673a || this.mErrorCode == 11) {
            return true;
        }
        throw new AssertionError();
    }

    public a(String str, int i2, int i3) {
        super(str, i2, i3);
    }
}
