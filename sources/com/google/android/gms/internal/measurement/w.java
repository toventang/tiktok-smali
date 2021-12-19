package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class w extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ oy f51291c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51292d;

    static {
        Covode.recordClassIndex(32071);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void a() {
        this.f51291c.a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51292d.f50845h.getCachedAppInstanceId(this.f51291c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(f fVar, oy oyVar) {
        super(fVar);
        this.f51292d = fVar;
        this.f51291c = oyVar;
    }
}
