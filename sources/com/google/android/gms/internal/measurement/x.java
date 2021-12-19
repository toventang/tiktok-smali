package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.f;

public final class x extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ oy f51293c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f f51294d;

    static {
        Covode.recordClassIndex(32072);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void a() {
        this.f51293c.a((Bundle) null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        this.f51294d.f50845h.getCurrentScreenClass(this.f51293c);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(f fVar, oy oyVar) {
        super(fVar);
        this.f51294d = fVar;
        this.f51293c = oyVar;
    }
}
