package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

final class cl extends ThreadLocal<Boolean> {
    static {
        Covode.recordClassIndex(31284);
    }

    cl() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Boolean initialValue() {
        return false;
    }
}
