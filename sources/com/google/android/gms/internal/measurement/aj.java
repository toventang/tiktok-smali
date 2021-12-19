package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.measurement.f;

final class aj extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f50656c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ f.b f50657d;

    static {
        Covode.recordClassIndex(31606);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        f.this.f50845h.onActivityPaused(b.a(this.f50656c), this.f50849b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    aj(f.b bVar, Activity activity) {
        super(f.this);
        this.f50657d = bVar;
        this.f50656c = activity;
    }
}
