package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.h.a;
import com.google.android.gms.internal.h.b;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class ac implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f5792a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b f5793b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e f5794c;

    static {
        Covode.recordClassIndex(2428);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        try {
            a aVar = this.f5794c.f5824e;
            String packageName = this.f5794c.f5823d.getPackageName();
            String str = this.f5793b.f5815a;
            String str2 = this.f5794c.f5821b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str2);
            Bundle d2 = aVar.d(packageName, str, bundle);
            this.f5794c.a(new ad(this, b.a(d2), b.b(d2)));
            return null;
        } catch (Exception e2) {
            this.f5794c.a(new ae(this, e2));
            return null;
        }
    }

    ac(e eVar, b bVar, c cVar) {
        this.f5794c = eVar;
        this.f5793b = bVar;
        this.f5792a = cVar;
    }
}
