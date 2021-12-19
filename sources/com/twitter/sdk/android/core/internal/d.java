package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f155962a;

    /* renamed from: b  reason: collision with root package name */
    private final b f155963b;

    static {
        Covode.recordClassIndex(103630);
    }

    d(c cVar, b bVar) {
        this.f155962a = cVar;
        this.f155963b = bVar;
    }

    public final void run() {
        c cVar = this.f155962a;
        b bVar = this.f155963b;
        b a2 = cVar.a();
        if (!bVar.equals(a2)) {
            k.c().b();
            cVar.a(a2);
        }
    }
}
