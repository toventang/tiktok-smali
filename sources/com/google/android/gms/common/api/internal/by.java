package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class by implements ca {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ bz f50130a;

    static {
        Covode.recordClassIndex(31268);
    }

    by(bz bzVar) {
        this.f50130a = bzVar;
    }

    @Override // com.google.android.gms.common.api.internal.ca
    public final void a(BasePendingResult<?> basePendingResult) {
        this.f50130a.f50133c.remove(basePendingResult);
        basePendingResult.c();
    }
}
