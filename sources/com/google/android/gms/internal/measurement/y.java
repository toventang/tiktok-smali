package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class y extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ oy f51295c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51296d;

    static {
        Covode.recordClassIndex(32073);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void a() {
        this.f51295c.a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51296d.f50845h.getCurrentScreenName(this.f51295c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(f fVar, oy oyVar) {
        super(fVar);
        this.f51296d = fVar;
        this.f51295c = oyVar;
    }
}
