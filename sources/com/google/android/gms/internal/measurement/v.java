package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

/* access modifiers changed from: package-private */
public final class v extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ oy f51289c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51290d;

    static {
        Covode.recordClassIndex(32070);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void a() {
        this.f51289c.a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51290d.f50845h.generateEventId(this.f51289c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    v(f fVar, oy oyVar) {
        super(fVar);
        this.f51290d = fVar;
        this.f51289c = oyVar;
    }
}
