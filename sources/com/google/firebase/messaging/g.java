package com.google.firebase.messaging;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.c;
import com.google.android.gms.c.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final d f54611a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f54612b;

    static {
        Covode.recordClassIndex(33884);
    }

    g(d dVar, Intent intent) {
        this.f54611a = dVar;
        this.f54612b = intent;
    }

    @Override // com.google.android.gms.c.c
    public final void a(h hVar) {
        this.f54611a.lambda$onStartCommand$1$EnhancedIntentService(this.f54612b, hVar);
    }
}
