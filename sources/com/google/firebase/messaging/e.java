package com.google.firebase.messaging;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f54607a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f54608b;

    /* renamed from: c  reason: collision with root package name */
    private final i f54609c;

    static {
        Covode.recordClassIndex(33882);
    }

    e(d dVar, Intent intent, i iVar) {
        this.f54607a = dVar;
        this.f54608b = intent;
        this.f54609c = iVar;
    }

    public final void run() {
        this.f54607a.lambda$processIntent$0$EnhancedIntentService(this.f54608b, this.f54609c);
    }
}
