package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.a.b;
import com.google.android.gms.internal.measurement.f;

final class ai extends f.a {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f50653c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Bundle f50654d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ f.b f50655e;

    static {
        Covode.recordClassIndex(31605);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.f.a
    public final void b() {
        f.this.f50845h.onActivityCreated(b.a(this.f50653c), this.f50654d, this.f50849b);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ai(f.b bVar, Activity activity, Bundle bundle) {
        super(f.this);
        this.f50655e = bVar;
        this.f50653c = activity;
        this.f50654d = bundle;
    }
}
