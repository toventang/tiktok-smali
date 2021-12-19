package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.measurement.f;

final class an extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f50665c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f.b f50666d;

    static {
        Covode.recordClassIndex(31610);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        f.this.f50845h.onActivityDestroyed(b.a(this.f50665c), this.f50849b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    an(f.b bVar, Activity activity) {
        super(f.this);
        this.f50666d = bVar;
        this.f50665c = activity;
    }
}
