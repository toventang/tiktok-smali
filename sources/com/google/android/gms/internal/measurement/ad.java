package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class ad extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ oy f50635c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f50636d;

    static {
        Covode.recordClassIndex(31600);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void a() {
        this.f50635c.a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f50636d.f50845h.getAppInstanceId(this.f50635c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ad(f fVar, oy oyVar) {
        super(fVar);
        this.f50636d = fVar;
        this.f50635c = oyVar;
    }
}
