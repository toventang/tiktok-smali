package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.d.g;
import f.a.e.b.b;
import f.a.e.e.b.ad;
import f.a.h.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

final /* synthetic */ class bq implements g {

    /* renamed from: a  reason: collision with root package name */
    private final bo f14625a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f14626b;

    static {
        Covode.recordClassIndex(8125);
    }

    bq(bo boVar, byte[] bArr) {
        this.f14625a = boVar;
        this.f14626b = bArr;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        bo boVar = this.f14625a;
        if (this.f14626b.length <= 0 && boVar.f14604c <= 10) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aa a2 = a.a(f.a.k.a.f158005b);
            b.a((Object) timeUnit, "unit is null");
            b.a((Object) a2, "scheduler is null");
            a.a(new ad(Math.max(0L, 500L), timeUnit, a2));
        }
        b.a(obj, "throwable is null");
        Callable a3 = f.a.e.b.a.a(obj);
        b.a((Object) a3, "errorSupplier is null");
        return a.a(new f.a.e.e.b.g(a3));
    }
}
