package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.measurement.f;

final class ah extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f50651c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f.b f50652d;

    static {
        Covode.recordClassIndex(31604);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        f.this.f50845h.onActivityStarted(b.a(this.f50651c), this.f50849b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ah(f.b bVar, Activity activity) {
        super(f.this);
        this.f50652d = bVar;
        this.f50651c = activity;
    }
}
