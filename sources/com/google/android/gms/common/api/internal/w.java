package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;

final class w implements k.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BasePendingResult f50279a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ cv f50280b;

    static {
        Covode.recordClassIndex(31326);
    }

    @Override // com.google.android.gms.common.api.k.a
    public final void a(Status status) {
        this.f50280b.f50204a.remove(this.f50279a);
    }

    w(cv cvVar, BasePendingResult basePendingResult) {
        this.f50280b = cvVar;
        this.f50279a = basePendingResult;
    }
}
